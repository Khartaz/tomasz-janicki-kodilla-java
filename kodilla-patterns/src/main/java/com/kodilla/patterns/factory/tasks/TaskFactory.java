package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING_TASK = "SHOPPING_TASK";
    public static final String PAINTING_TASK = "PAINTING_TASK";
    public static final String DRIVING_TASK = "DRIVING_TASK";

    public final Task taskFactory(final String taskClass) {
        switch (taskClass) {
            case SHOPPING_TASK:
                return new ShoppingTask("Shoping time ", "Candys ", 100.0);
            case PAINTING_TASK:
                return new PaintingTask("Paint ", "Black ", "Wall");
            case DRIVING_TASK:
                return new DrivingTask("Drive to: ", "California ", "Car");
            default:
                return null;
        }
    }
}
