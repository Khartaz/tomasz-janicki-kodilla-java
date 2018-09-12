package com.kodilla.testing.shape;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.*;

public class ShapeCollectorTestSuite {
    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        //List<Shape> expected = Arrays.asList(new Square());
        //When
        List<Shape> actual = shapeCollector.addFigure(new Square());
        //Then
        Assert.assertEquals(1, actual.size());
    }
    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape1 = new Square();
        List<Shape> shapes = new ArrayList<>();
        shapes.add(shape1);
        //When
        List<Shape> result = shapeCollector.removeFigure(shape1);
        //Then
        Assert.assertTrue(result.isEmpty());
    }
    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape1 = new Square();
        shapeCollector.addFigure(shape1);
        //When
        Shape result = shapeCollector.getFigure(0);
        //Then
        Assert.assertEquals(result, shape1);
    }
    @Test
    public void testShowFigures() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        List<Shape> actual = new ArrayList<>();
        List<Shape> expected = Arrays.asList(new Square(), new Triangle(), new Circle());
        actual.add(new Square());
        actual.add(new Triangle());
        actual.add(new Circle());
        //When
        shapeCollector.showFigures(actual);
        //Then
        Assert.assertEquals(actual.size(), expected.size() );
    }
}
