package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;
import java.util.Random;

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
        OddNumbersExterminator even = new OddNumbersExterminator();
        ArrayList<Integer> test = new ArrayList<>();
        System.out.println(even.exterminate(test));
    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        OddNumbersExterminator even = new OddNumbersExterminator();
        ArrayList<Integer> test = new ArrayList<>();
        Random random = new Random();
        for(int i=0; i < 10; i++) {
            test.add(random.nextInt(100));
        }
        System.out.println(even.exterminate(test));
        System.out.println(test);
    }
}
