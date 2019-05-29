// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var movie_pb = require('./movie_pb.js');

function serialize_movie_ListMoviesRequest(arg) {
  if (!(arg instanceof movie_pb.ListMoviesRequest)) {
    throw new Error('Expected argument of type movie.ListMoviesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_movie_ListMoviesRequest(buffer_arg) {
  return movie_pb.ListMoviesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_movie_Movie(arg) {
  if (!(arg instanceof movie_pb.Movie)) {
    throw new Error('Expected argument of type movie.Movie');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_movie_Movie(buffer_arg) {
  return movie_pb.Movie.deserializeBinary(new Uint8Array(buffer_arg));
}


var MovieLibraryService = exports.MovieLibraryService = {
  // Bidirectional streaming rpc to allow user to get and add movies to collection
  getAndUpdateMovieLibrary: {
    path: '/movie.MovieLibrary/getAndUpdateMovieLibrary',
    requestStream: true,
    responseStream: true,
    requestType: movie_pb.Movie,
    responseType: movie_pb.Movie,
    requestSerialize: serialize_movie_Movie,
    requestDeserialize: deserialize_movie_Movie,
    responseSerialize: serialize_movie_Movie,
    responseDeserialize: deserialize_movie_Movie,
  },
  // server side streaming rpc to allow user to fetch movies from the server
  listMovies: {
    path: '/movie.MovieLibrary/listMovies',
    requestStream: false,
    responseStream: true,
    requestType: movie_pb.ListMoviesRequest,
    responseType: movie_pb.Movie,
    requestSerialize: serialize_movie_ListMoviesRequest,
    requestDeserialize: deserialize_movie_ListMoviesRequest,
    responseSerialize: serialize_movie_Movie,
    responseDeserialize: deserialize_movie_Movie,
  },
};

exports.MovieLibraryClient = grpc.makeGenericClientConstructor(MovieLibraryService);
