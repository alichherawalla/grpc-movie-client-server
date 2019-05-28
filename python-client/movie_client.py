# Copyright 2015 gRPC authors.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
"""The Python implementation of the gRPC route guide client."""

from __future__ import print_function

import logging
import threading
import uuid

import grpc

import movie_pb2
import movie_pb2_grpc

GENRES = ["THRILLER", "ACTION"]
MAX_PAGE_SIZE = 100
CLIENT_ID = str(uuid.uuid4())


def stream_movies(movies):
    for movie in movies:
        print("\n\n******Movie received: \nid: %s\nmovie_name: %s \ngenre: %s \nclient_id:%s"
              % (movie.id, movie.movie_name, movie.genre, movie.client_id))


def list_movies(stub, genre):
    list_movies_request = movie_pb2.ListMoviesRequest(current_id=0, max_page_size=MAX_PAGE_SIZE, genre=genre,
                                                              client_id=CLIENT_ID)
    movies = stub.listMovies(list_movies_request)
    stream_movies(movies)


def get_and_update_movie_library(stub):
    movies = stub.getAndUpdateMovieLibrary(publish_movie())
    stream_movies(movies)


def publish_movie():
    while 1:
        genre = input("Please enter genre: ")
        movie_name = input("Please enter movie name: ")
        movie = movie_pb2.Movie(movie_name=movie_name, client_id=CLIENT_ID, genre=genre)
        yield movie


def run():
    with grpc.insecure_channel('localhost:8980') as channel:
        stub = movie_pb2_grpc.MovieLibraryStub(channel)
        threads = []
        for topic in GENRES:
            thread = threading.Thread(target=list_movies, args=(stub, topic), daemon=True)
            thread.start()
            threads.append(thread)
        get_and_update_movie_library(stub)
        for thread in threads:
            thread.join()


if __name__ == '__main__':
    logging.basicConfig()
    threading.Thread(target=run).start()
