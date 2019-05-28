package com.betasolutions.grpc.movie;

import com.betasolutions.grpc.movie.MovieLibraryGrpc.MovieLibraryImplBase;
import io.grpc.stub.StreamObserver;

import java.util.*;

import static com.betasolutions.grpc.movie.Constants.MOVIES;

public class MovieService extends MovieLibraryImplBase {
    private final Logger logger;

    MovieService() {
        logger = new Logger(MovieService.class);
    }

    private static HashMap<String, HashMap<String, StreamObserver<Movie>>> MOVIE_OBSERVERS = new HashMap<>();


    @Override
    public StreamObserver<Movie> getAndUpdateMovieLibrary(StreamObserver<Movie> responseObserver) {
        return new StreamObserver<Movie>() {
            @Override
            public void onNext(Movie movie) {
                Collection<StreamObserver<Movie>> genreMovieObservers =
                    addNewObserver(movie.getId(), movie.getGenre(), movie.getClientId(), responseObserver, true);
                publishMovie(movie, genreMovieObservers);
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {

            }
        };
    }

    @Override
    public void listMovies(ListMoviesRequest request, StreamObserver<Movie> responseObserver) {
        ArrayList<Movie> movies = getGenreMovies(request.getGenre());
        movies.forEach(responseObserver::onNext);
        addNewObserver(request.getCurrentId(), request.getGenre(), request.getClientId(), responseObserver, false);
    }


    private static HashMap<String, StreamObserver<Movie>> getGenreMovieObservers(String g) {
        String genre = g.toUpperCase();
        if (MOVIE_OBSERVERS.get(genre) != null) {
            return MOVIE_OBSERVERS.get(genre);
        } else {
            return new HashMap<>();
        }
    }

    private ArrayList<Movie> getGenreMovies(String genre) {
        return MOVIES.computeIfAbsent(genre.toUpperCase(), k -> new ArrayList<>());
    }

    private void publishMovie(Movie requestMovie, Collection<StreamObserver<Movie>> genreMovieObservers) {
        ArrayList<Movie> genreMovies = getGenreMovies(requestMovie.getGenre());

        Movie movie = Movie
            .newBuilder(requestMovie)
            .setId(genreMovies.size() + 1)
            .build();

        genreMovies.add(movie);

        Set<StreamObserver<Movie>> toRemove = new HashSet<>();
        for (StreamObserver<Movie> next : genreMovieObservers) {
            try {
                System.out.println("publishing movie received: " + movie);
                next.onNext(movie);
            } catch (Exception e) {

                toRemove.add(next);
                logger.info("removed");
            }
        }
        for (StreamObserver<Movie> next : toRemove) {
            genreMovieObservers.remove(next);
        }
        MOVIES.put(movie.getGenre(), genreMovies);
    }

    private Collection<StreamObserver<Movie>> addNewObserver(long currentId, String g, String clientId,
                                                             StreamObserver<Movie> responseObserver,
                                                             boolean listMovies) {
        String genre = g.toUpperCase();
        // getting all the observers for this genre
        HashMap<String, StreamObserver<Movie>> observers = getGenreMovieObservers(genre);
        if (observers.containsKey(clientId)) {
            return observers.values();
        } else {
            observers.put(clientId, responseObserver);
            MOVIE_OBSERVERS.put(genre, observers);
            ListMoviesRequest listMoviesRequest = ListMoviesRequest.newBuilder()
                .setClientId(clientId)
                .setCurrentId(currentId)
                .setGenre(genre)
                .setMaxPageSize(100)
                .build();
            if (listMovies) {
                listMovies(listMoviesRequest, responseObserver);
            }
            return observers.values();
        }
    }

}
