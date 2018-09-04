package com.kodilla.contractorApp;

import java.util.Scanner;

public class TerminalController {

    private static final Scanner in = new Scanner(System.in);

    public static String getName() {
        System.out.println("Please enter your name: ");

        boolean correctValue = false;
        String input;
        do {
            input = in.next();

            if(input == null || input.isEmpty()) {
                System.out.println("Please enter correct yout name.");
            } else {
                correctValue = true;
            }
        } while (correctValue);
        return input;
    }
}
