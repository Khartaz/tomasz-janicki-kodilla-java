package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HomeworkTestSuite {

    @Test
    public void testUpdate() {
        //Given
        Tasklist tasklist1 = new ModuleOne();
        Tasklist tasklist2 = new ModuleTwo();
        Mentor mentor1 = new Mentor("New Mentor");
        Mentor mentor2 = new Mentor("Old Mentor");
        tasklist1.registerObserver(mentor1);
        tasklist1.registerObserver(mentor2);
        tasklist2.registerObserver(mentor1);
        //When
        tasklist1.addTask("Test post");
        tasklist1.addTask("Test post2");
        tasklist2.addTask("Test post");
        tasklist2.addTask("test post2");
        //Then
        assertEquals(4, mentor1.getUpdateCount());
        assertEquals(2, mentor2.getUpdateCount());
    }
}
