package com.kodilla.testing.forum.statistics;

import org.junit.*;
import org.mockito.Mockito;
import org.mockito.internal.configuration.injection.MockInjection;

import java.util.ArrayList;
import java.util.Arrays;

public class StatisticsTestSuite {
    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }
    @After
    public void after() {
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }
    @Test
    public void testCalculateAdvStatistics() {

    }

    @Test
    public void calculateAvgStatisticsWhenPostsCountIsZero() {
        //Given
        Statistics statistics = Mockito.mock(Statistics.class);
        Mockito.when(statistics.postsCount()).thenReturn(0);
        Mockito.when(statistics.commentsCount()).thenReturn(100);
        Mockito.when(statistics.userNames()).thenReturn(Arrays.asList("Adam", "Karol", "sasd"));
        //When
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        statisticsCalculator.calculateAdvStatistics(statistics);
        //Then
        Assert.assertEquals(0, statisticsCalculator.getAveragePostsPerUser(), 0.001);
        Assert.assertEquals(33.333, statisticsCalculator.getAverageCommentsPerUser(), 0.001 );
        Assert.assertEquals(0, statisticsCalculator.getAverageCommentsPerPost(), 0.001);
    }

    @Test
    public void calculateAvgStatisticsWhenPostsCountIs100() {
        //Given
        Statistics statistics = Mockito.mock(Statistics.class);
        Mockito.when(statistics.postsCount()).thenReturn(100);
        Mockito.when(statistics.commentsCount()).thenReturn(100);
        Mockito.when(statistics.userNames()).thenReturn(Arrays.asList("Adam", "Karol", "sasd"));
        //When
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        statisticsCalculator.calculateAdvStatistics(statistics);
        //Then
        Assert.assertEquals(33.333, statisticsCalculator.getAveragePostsPerUser(), 0.001);
        Assert.assertEquals(33.333, statisticsCalculator.getAverageCommentsPerUser(), 0.001 );
        Assert.assertEquals(1, statisticsCalculator.getAverageCommentsPerPost(), 0.001);
    }
}
