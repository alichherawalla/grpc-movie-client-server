package com.betasolutions.grpc.movie;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import static com.betasolutions.grpc.movie.Constants.*;

public class MovieClient {

    private final Logger logger;
    private final ManagedChannel channel;
    private final MovieLibraryGrpc.MovieLibraryStub asyncMovieLibraryStub;
    private static final String CLIENT_ID = UUID.randomUUID().toString();
    private static final List<String> GENRES = Arrays.asList(HORROR, ACTION, THRILLER);

    private MovieClient(String host, int port) {
        this(ManagedChannelBuilder.forAddress(host, port).usePlaintext());
    }

    private MovieClient(ManagedChannelBuilder<?> channelBuilder) {
        channel = channelBuilder.build();
        asyncMovieLibraryStub = MovieLibraryGrpc.newStub(channel);
        logger = new Logger(MovieClient.class);
    }

    private void shutdown() throws InterruptedException {
        logger.warning("Shutting down client");
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    private void listMessages(int currentId, int maxPageSize, String genre) {
        ListMoviesRequest request = ListMoviesRequest.newBuilder()
            .setCurrentId(currentId)
            .setMaxPageSize(maxPageSize)
            .setGenre(genre)
            .setClientId(CLIENT_ID)
            .build();

        try {
            asyncMovieLibraryStub.listMovies(request, new StreamObserver<Movie>() {
                @Override
                public void onNext(Movie movie) {
                    System.out.println("\n\n*****Movie received:\n" + movie);
                }

                @Override
                public void onError(Throwable t) {

                }

                @Override
                public void onCompleted() {

                }
            });

        } catch (StatusRuntimeException e) {
            logger.warning("RPC failed: {0} ", e.getStatus());
        }
    }

    public void getAndUpdateMovieLibrary() {
        try {
            StreamObserver<Movie> requestObserver = asyncMovieLibraryStub.getAndUpdateMovieLibrary(new StreamObserver<Movie>() {
                @Override
                public void onNext(Movie movie) {
                    System.out.println("\n\n*****Message received\n" + movie);
                }

                @Override
                public void onError(Throwable t) {

                }

                @Override
                public void onCompleted() {

                }
            });

            while (true) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Please enter the genre: ");
                String genre = scanner.nextLine();
                System.out.println("Please enter the name of the movie: ");
                String movieName = scanner.nextLine();
                Movie movie = Movie.newBuilder()
                    .setGenre(genre)
                    .setMovieName(movieName)
                    .setClientId(CLIENT_ID)
                    .build();
                requestObserver.onNext(movie);
            }


        } catch (StatusRuntimeException e) {
            logger.warning("RPC failed: {0}", e.getStatus());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MovieClient movieClient = new MovieClient("localhost", 8980);
        System.out.println("CLIENT_ID: " + CLIENT_ID);
        try {
            GENRES.forEach(topic -> {
                movieClient.listMessages(0, 100, topic);
            });
            movieClient.getAndUpdateMovieLibrary();

        } catch (Exception e) {
            e.printStackTrace();
            new Logger(MovieClient.class).warning("shutting down {0}", (Object) e.getStackTrace());
        } finally {
            movieClient.shutdown();
        }
    }
}
