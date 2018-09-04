package com.kodilla.contractorApp;

import java.util.Scanner;

public class TerminalController {

    private static final Scanner IN = new Scanner(System.in);

    public static String getName() {
        System.out.println("Please enter your name: ");

        boolean correctValue = false;
        String input;
        do {
            input = IN.nextLine();

            if(input == null || input.isEmpty()) {
                System.out.println("Please enter correct name.");
            } else {
                correctValue = true;
            }
        } while (!correctValue);
        return input;
    }

    public static String getLastName() {
        System.out.println("Please enter your last name: ");

        boolean correctValue = false;
        String input;
        do {
            input = IN.nextLine();

            if(input == null || input.isEmpty()) {
                System.out.println("Please enter correct last name.");
            } else {
                correctValue = true;
            }
         } while (!correctValue);
        return input;
    }

    public static String getNip() {
        System.out.println("Please enter your NIP number: ");

        boolean correctValue = false;
        String input;
        do {
            input = IN.nextLine();

            if(input == null || input.isEmpty() || input.length() != 10) {
               System.out.println("Please enter correct NIP.");
            } else {
                 correctValue = true;
            }
        } while (!correctValue);
        return input;
    }
}
