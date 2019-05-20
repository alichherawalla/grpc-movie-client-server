package com.betasolutions.grpc.chat;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;
import java.net.URL;

public class ChatServer {

    private int port;
    private final Server server;
    private final Logger logger;

    private ChatServer(int port) throws IOException {
        this(ServerBuilder.forPort(port), port);

    }

    private ChatServer(ServerBuilder<?> serverBuilder, int port) {
        logger = new Logger(ChatServer.class);
        this.port = port;
        server = serverBuilder.addService(new ChatService()).build();
    }

    private void start() throws IOException {
        server.start();
        logger.info("Server started, listening on: " + port);
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                System.err.println("*** Shutting down gRPC server since JVM is shutting down");
                ChatServer.this.stop();
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
        ChatServer chatServer = new ChatServer(8980);
        chatServer.start();
        chatServer.blockUntilShutdown();
    }

}
