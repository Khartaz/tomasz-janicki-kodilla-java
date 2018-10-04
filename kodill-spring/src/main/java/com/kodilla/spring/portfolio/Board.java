package com.kodilla.spring.portfolio;

public final class Board {
    TaskList taskList;
    private final TaskList toDoList;
    private final TaskList inProgressList;
    private final TaskList doneList;

    public Board(final TaskList toDoList, final TaskList inProgressList, final TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public TaskList getToDoList() {
        return toDoList;
    }

    public TaskList getInProgressList() {
        return inProgressList;
    }

    public TaskList getDoneList() {
        return doneList;
    }

    public void getTasks() {

    }

    @Override
    public String toString() {
        return "Board{" +
                "toDoList=" + toDoList +
                ", inProgressList=" + inProgressList +
                ", doneList=" + doneList +
                '}';
    }
}
