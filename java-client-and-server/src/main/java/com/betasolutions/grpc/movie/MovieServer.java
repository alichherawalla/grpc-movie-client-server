package com.betasolutions.grpc.movie;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class MovieServer {

    private int port;
    private final Server server;
    private final Logger logger;

    private MovieServer(int port) throws IOException {
        this(ServerBuilder.forPort(port), port);

    }

    private MovieServer(ServerBuilder<?> serverBuilder, int port) {
        logger = new Logger(MovieServer.class);
        this.port = port;
        server = serverBuilder.addService(new MovieService()).build();
    }

    private void start() throws IOException {
        server.start();
        logger.info("Server started, listening on: " + port);
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                System.err.println("*** Shutting down gRPC server since JVM is shutting down");
                MovieServer.this.stop();
                System.err.println("*** Server shut down");
            }
        });
    }

    private void stop() {
        if (server != null) {
            server.shutdown();
        }
    }

    private void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }

    public static void main(String[] args) throws Exception {
        MovieServer chatServer = new MovieServer(8980);
        chatServer.start();
        chatServer.blockUntilShutdown();
    }

}
