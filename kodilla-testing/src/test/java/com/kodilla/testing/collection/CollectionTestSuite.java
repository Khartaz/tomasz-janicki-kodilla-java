package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }
    @After
    public void after() {
        System.out.println("Test Case: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator even = new OddNumbersExterminator();
        ArrayList<Integer> test = new ArrayList<>();
        //When
        even.exterminate(test);
        //Then
        Assert.assertTrue(test.isEmpty());
    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator even = new OddNumbersExterminator();
        ArrayList<Integer> actual = new ArrayList<>();
        List<Integer> expected = new ArrayList<>();
        List<Integer> result;
        actual.add(1);
        actual.add(89);
        actual.add(55);
        actual.add(24);
        actual.add(58);
        //When
        expected.add(24);
        expected.add(58);
        result = even.exterminate(actual);
        //Then
        Assert.assertEquals(result, expected);
    }
}