package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void getLastLog() {
        //Given
        Logger.getInstance().log("New looog");
        Logger.getInstance().log("2nd looog");
        Logger.getInstance().log("3nd looog");
        //When & Then
        Assert.assertEquals("3nd looog", Logger.getInstance().getLastLog());
    }
}
