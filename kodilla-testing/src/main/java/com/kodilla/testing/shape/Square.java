package com.kodilla.testing.shape;

public class Square implements Shape {
    public double side;

    @Override
    public double getField() {
        return side * side;
    }

    @Override
    public String getShapeName() {
        return "Square";
    }

}
