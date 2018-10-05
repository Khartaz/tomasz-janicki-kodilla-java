package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {
    @Bean
    public Board getBoard() {
        return new Board(getTaskList(), getTaskList(), getTaskList());
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public TaskList getTaskList() {
        return new TaskList();
    }
}
