package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class BoardTestSuite {
    @Test
    public void testTaskAddDoneList() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        TaskList taskList = context.getBean(TaskList.class);
        List<String> expected = new ArrayList<>();
        expected.add("s");
        //When
        board.getDoneList().tasks.add("s");
        List<String> result = taskList.getTasks();
        //Then
        Assert.assertEquals(expected, result);
    }
    @Test
    public void testAddTaskToDoList() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        TaskList taskList = context.getBean(TaskList.class);
        List<String> expected = new ArrayList<>();
        expected.add("u");
        //When
        board.getToDoList().tasks.add("u");
        List<String> result = taskList.getTasks();
        //Then
        Assert.assertEquals(expected, result);
    }
    @Test
    public void testAddTaskAddInProgressList() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        TaskList taskList = context.getBean(TaskList.class);
        List<String> expected = new ArrayList<>();
        expected.add("p");
        //When
        board.getToDoList().tasks.add("p");
        List<String> result = taskList.getTasks();
        //Then
        Assert.assertEquals(expected, result);
    }
}
