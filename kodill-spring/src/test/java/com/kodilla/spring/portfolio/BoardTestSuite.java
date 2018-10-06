package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    @Test
    public void testTaskAddDoneList() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.getDoneList().addTask("s");
        //Then
        Assert.assertEquals(1, board.getDoneList().getTasks().size());
        Assert.assertTrue(board.getToDoList().getTasks().isEmpty());
        Assert.assertTrue(board.getInProgressList().getTasks().isEmpty());
        Assert.assertEquals("s", board.getDoneList().getTasks().get(0));
    }
    @Test
    public void testAddTaskToDoList() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.getToDoList().addTask("todo");
        //Then
        Assert.assertEquals(1, board.getToDoList().getTasks().size());
        Assert.assertTrue(board.getDoneList().getTasks().isEmpty());
        Assert.assertTrue(board.getInProgressList().getTasks().isEmpty());
        Assert.assertEquals("todo", board.getToDoList().getTasks().get(0));

    }
    @Test
    public void testAddTaskAddInProgressList() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.getInProgressList().addTask("pojo");
        //Then
        Assert.assertEquals(1, board.getInProgressList().getTasks().size());
        Assert.assertTrue(board.getDoneList().getTasks().isEmpty());
        Assert.assertTrue(board.getToDoList().getTasks().isEmpty());
        Assert.assertEquals("pojo", board.getInProgressList().getTasks().get(0));
    }
}
