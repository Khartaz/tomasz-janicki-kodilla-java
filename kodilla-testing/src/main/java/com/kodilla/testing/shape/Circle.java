package com.kodilla.testing.shape;

public class Circle implements Shape{
    public double radius;

    @Override
    public double getField() {
        Double result = Math.PI*radius;
        result=Math.round( result * 100.0 ) / 100.0;
        return result;
    }

    @Override
    public String getShapeName() {
        return "Circle";
    }
}