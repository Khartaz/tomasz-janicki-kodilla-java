package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

class OddNumbersExterminator {
    public List<Integer> exterminate(ArrayList<Integer> numbers) {
        List<Integer> evens = new ArrayList<>();
        boolean empty = numbers.isEmpty();
        if(empty) {
            System.out.println("List is empty.");
        }
        for(Integer number : numbers) {
            int even = number % 2;
            if (even == 0) {
                evens.add(number);
            }
        }
        return evens;
    }
}
