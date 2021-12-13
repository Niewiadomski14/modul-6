package com.kodilla.good.patterns.challenges;

import java.util.List;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        String result = movieStore.getMovies().values().stream()
                .flatMap(List::stream)
                .collect(Collectors.joining("!"));

        System.out.println(result);
    }
}