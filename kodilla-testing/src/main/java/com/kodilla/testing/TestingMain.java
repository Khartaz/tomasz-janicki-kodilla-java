package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if(result.equals("theForumUser")) {
            System.out.println("test OK");
        }  else  {
            System.out.println("Error!");
        }

        System.out.println("Test - piewszy test jednostkowy: ");
        // Nie wiem czy o to chodzilo...
        Calculator calculator = new Calculator();

        int result2 = calculator.add(2,4);
        int result3 = calculator.subtract(4,3);

        System.out.println(result2);
        System.out.println(result3);

        if(result2 == 6) {
            System.out.println("Test OK");
        } else {
            System.out.println("Error");
        }

        if(result3 == 1) {
            System.out.println("Test OK");
        } else {
            System.out.println("Error");
        }
    }
}
