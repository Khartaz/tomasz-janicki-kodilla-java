package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    final List<String> tasks;

    public TaskList() {
        this.tasks = new ArrayList<>();
    }

    public List<String> getTasks() {
        return new ArrayList<>(tasks);
    }

    public List<String> addTask(String task) {
        return new ArrayList<>(tasks);
    }
}
