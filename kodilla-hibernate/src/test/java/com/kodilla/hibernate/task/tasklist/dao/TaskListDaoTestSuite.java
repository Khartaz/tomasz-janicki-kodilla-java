package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.task.TaskFinancialDetails;
import com.kodilla.hibernate.task.tasklist.TaskList;
import com.kodilla.hibernate.task.tasklist.dao.TaskListDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    TaskListDao taskListDao;
    private final static String DESCRIPTION = "Test of tasklist";
    private final static String LISTNAME = "New list";

    @Test
    public void testTaskListDaoSave() {
        //Given
        TaskList taskList = new TaskList(LISTNAME, DESCRIPTION);
        //When
        taskListDao.save(taskList);
        //Then
        int id = taskList.getId();
        TaskList readTaskList = taskListDao.findOne(id);
        Assert.assertEquals(id, readTaskList.getId());
        //CleanUp
        taskListDao.delete(id);
    }

    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList(LISTNAME, DESCRIPTION);
        taskListDao.save(taskList);
        String listName = taskList.getListName();
        //When
        List<TaskList> readTaskList = taskListDao.findByListName(listName);
        //Then
        Assert.assertEquals(1, readTaskList.size());
        //CleanUp
        int id = readTaskList.get(0).getId();
        taskListDao.delete(id);
    }

    @Test
    public void testTaskListDaoSaveWithTasks() {
        //Given
        Task task = new Task("Test: Learn Hibernate", 14);
        Task task2 = new Task("Test: Write some entities", 3);
        TaskFinancialDetails taskFinancialDetails = new TaskFinancialDetails(new BigDecimal(20), false);
        TaskFinancialDetails taskFinancialDetails2 = new TaskFinancialDetails(new BigDecimal(10), false);
        task.setTaskFinancialDetails(taskFinancialDetails);
        task2.setTaskFinancialDetails(taskFinancialDetails2);
        TaskList taskList = new TaskList(LISTNAME, "ToDo tasks");
        taskList.getTasks().add(task);
        taskList.getTasks().add(task2);
        task.setTaskList(taskList);
        task2.setTaskList(taskList);
        //When
        taskListDao.save(taskList);
        int id = taskList.getId();
        //Then
        Assert.assertNotEquals(0, id);
        //CleanUp
        taskListDao.delete(id);


    }
}
