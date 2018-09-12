package com.kodilla.testing.shape;

public class Triangle implements Shape{
    public double base;
    public double height;
    @Override
    public double getField() {
        return base*height/2;
    }

    @Override
    public String getShapeName() {
        return "Triangle";
    }
}

