package com.kodilla.patterns.factory;

public final class Rectangle implements Shape{
    final private String name;
    final private double width;
    final private double length;

    public Rectangle(String name, double width, double length) {
        this.name = name;
        this.width = width;
        this.length = length;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getCircumference() {
        return 2 * width + 2 * length;
    }
}
