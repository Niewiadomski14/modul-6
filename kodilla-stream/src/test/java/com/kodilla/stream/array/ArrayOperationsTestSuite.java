package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite implements ArrayOperations {

    @Test
    void testGetAverage(){

        final int[] table = new int[20];

            for (int i = 0; i < 20; i++) {
                table[i] = i + 1;
            }

            OptionalDouble average = ArrayOperations.getAverage(table);

            assertEquals(10.5, average.getAsDouble(), 0.001);
            System.out.println(average.getAsDouble());




    }



}
