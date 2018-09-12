package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private List<Shape> shapes = new ArrayList<>();

    public List<Shape> addFigure(Shape shape){
        shapes.add(shape);
        return shapes;

    }

    public List<Shape> removeFigure(Shape shape) {
        shapes.remove(shape);
        return shapes;
    }

    public Shape getFigure(int n) {
        return shapes.get(n);
    }

    public String showFigures(List<Shape> shapes) {
        StringBuilder sb = new StringBuilder();

        for (Shape shape : shapes) {
            sb.append(shape.getShapeName())
                    .append(" ");
        }
        return sb.toString();
    }
}

