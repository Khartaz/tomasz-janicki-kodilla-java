package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User user1 = new YGeneration("User1");
        User user2 = new Millenials("User2");
        User user3 = new ZGeneration("User3");

        //When
        String user1Should = user1.sharePost();
        System.out.println("User1 should: " + user1Should);
        String user2Should = user2.sharePost();
        System.out.println("User2 should: " + user2Should);
        String user3Should = user3.sharePost();
        System.out.println("User3 should: " + user3Should);

        //Then
        Assert.assertEquals("Twitter", user1Should);
        Assert.assertEquals("Facebook", user2Should);
        Assert.assertEquals("SnapChat", user3Should);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User user1 = new YGeneration("User1");

        //When
        String user1Should = user1.sharePost();
        System.out.println("User1 should: " + user1Should);
        user1.setSocialPublisher(new FacebookPublisher());
        user1Should = user1.sharePost();
        System.out.println("User1 now should: " + user1Should);

        //Then
        Assert.assertEquals("Facebook", user1Should);
    }
}
