package com.betasolutions.grpc.movie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

class Constants {

    // genre constants
    static final String HORROR = "HORROR";
    static final String ACTION = "ACTION";
    static final String THRILLER = "THRILLER";

    static HashMap<String, ArrayList<Movie>> MOVIES = new HashMap<String, ArrayList<Movie>>() {{
        put(HORROR, new ArrayList<Movie>() {{
            add(buildMovie(HORROR, "The Nun", 1));
            add(buildMovie(HORROR, "It follows", 2));
            add(buildMovie(HORROR, "The ring", 3));
            add(buildMovie(HORROR, "The Conjuring 3", 4));
            add(buildMovie(HORROR, "Omen", 5));
        }});
        put(ACTION, new ArrayList<Movie>() {{
            add(buildMovie(ACTION, "Avengers: Infinity War", 1));
            add(buildMovie(ACTION, "Avengers: Endgame", 2));
        }});
        put(THRILLER, new ArrayList<Movie>() {
            {
                add(buildMovie(THRILLER, "Ted Bundy Had a Son ", 1));
                add(buildMovie(THRILLER, "John Wick: Chapter 3 - Parabellum", 2));
                add(buildMovie(THRILLER, "Ad Astra", 3));
            }
        });
    }};

    private static Movie buildMovie(String genre, String movieName, int id) {
        return Movie.newBuilder()
            .setGenre(genre)
            .setMovieName(movieName)
            .setClientId(UUID.randomUUID().toString())
            .setId(id)
            .build();
    }
}
