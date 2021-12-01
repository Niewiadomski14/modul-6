package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {
    static OptionalDouble getAverage(int[]numbers) {
        IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .forEach(allValue -> System.out.println(allValue + " "));

        OptionalDouble average;
        average = IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .average();
        return average;



    }
}
