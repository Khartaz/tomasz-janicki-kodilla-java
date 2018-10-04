package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {
    @Autowired
    Board board;

    @Bean
    public Board getBoard() {
        return new Board(getTaskList(), getTaskList(), getTaskList());
    }

    @Bean
    public TaskList getTaskList() {
        return new TaskList();
    }
}
