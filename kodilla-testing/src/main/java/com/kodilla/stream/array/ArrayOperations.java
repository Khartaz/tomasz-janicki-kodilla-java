package com.kodilla.testing.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {
    static void getAverage(int[] numbers) {
        numbers = IntStream.range(0, numbers.length)
                        .toArray();
                IntStream.range(0, numbers.length)
                        .average()
                        .getAsDouble();
    }
}
