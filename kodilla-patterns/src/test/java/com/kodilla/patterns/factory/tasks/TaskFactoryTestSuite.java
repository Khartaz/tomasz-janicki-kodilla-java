package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shoppingTask = factory.taskFactory(TaskFactory.SHOPPING_TASK);
        //Then
        Assert.assertEquals("Shoping time ", shoppingTask.getTaskName());
        Assert.assertTrue(shoppingTask.isTaskExecuted());
        Assert.assertEquals("Shoping time Candys 100.0", shoppingTask.executeTask());
    }

    @Test
    public void testPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task paintingTask = factory.taskFactory(TaskFactory.PAINTING_TASK);
        //Then
        Assert.assertEquals("Paint ", paintingTask.getTaskName());
        Assert.assertTrue(paintingTask.isTaskExecuted());
        Assert.assertEquals("Paint Black Wall", paintingTask.executeTask());
    }
    @Test
    public void testDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task drivingTask = factory.taskFactory(TaskFactory.DRIVING_TASK);
        //Then
        Assert.assertEquals("Drive to: ", drivingTask.getTaskName());
        Assert.assertTrue(drivingTask.isTaskExecuted());
        Assert.assertEquals("Drive to: California Car", drivingTask.executeTask());
    }
}
