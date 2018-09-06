package com.kodilla.testing;

import java.util.ArrayList;
import java.util.List;

class OddNumbersExterminator {
    public void exterminate(ArrayList<Integer> numbers) {
        List<Integer> even = new ArrayList<>();
        for(Integer s : numbers){
            if(s %2 == 0) {
                even.add(s);
            }
        }
        System.out.println(even);
    }
}
public class TestingMain {
    public static void main(String[] args) {
        OddNumbersExterminator even = new OddNumbersExterminator();
        

    }
}


/*
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
 */