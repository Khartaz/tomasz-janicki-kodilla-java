package com.kodilla.testing.stream.array;

import com.kodilla.stream.array.ArrayOperations;
import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //Given
        int[] numbers = {5,5,2};
        //When
        double actual = ArrayOperations.getAverage(numbers);
        double expected = 4;
        //Then
        Assert.assertEquals(expected, actual, 0.00001);
    }
}
