package com.kodilla.exception.test;

public class ExceptionHandling  {
    SecondChallenge secondChallenge = new SecondChallenge();
       public void exceptionHandling () {
           try {
               secondChallenge.probablyIWillThrowException(2, 1.5);
           } catch (Exception e) {
               System.out.println(e);
           } finally {
               System.out.println("Error");
           }
       }
}

