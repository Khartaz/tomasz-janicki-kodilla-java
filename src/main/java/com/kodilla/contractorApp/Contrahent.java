package com.kodilla.contractorApp;

import java.util.*;

public class Contrahent {
    private final String name;
    private final String lastName;
    private final String nip;

    private List<Contrahent> contrahentsList = new LinkedList<>();

    public Contrahent(String name, String lastName, String nip) {
        this.name = name;
        this.lastName = lastName;
        this.nip = nip;
    }

    public String toString() {
        return "Name is: " + name + " " + lastName + " Nip number is: " + nip;
    }
}

/*
    public void createContrahent() {
        Scanner in = new Scanner(System.in);

        String name, lastName, nip;
        String a = in.next();

        System.out.println("Please enter your name: ");
        name = in.next();
        System.out.println("Please enter your last name: ");
        lastName = in.next();
        System.out.println("Please enter your NIP number: ");
        nip = in.next();

        Contrahent s = new Contrahent(name, lastName, nip); // contrahentsList.add(new Contrahent(name, lastName, nip));
        System.out.println("Add Adres");
        System.out.println("Enter adres type: ");
        adresType = in.next();
        System.out.println("Enter street");
        street = in.next();
        System.out.println("Enter post code");
        postCode = in.nextInt();
        System.out.println("Enter city");
        city = in.next();

        contrahentsList.add(s);
        //adresList.put(adresType, new Adress(street, postCode, city));  Adress f = adresType, new Adress(street, postCode, city);
    }


public void see() {
        for(String l : adresList.keySet()) {
            System.out.println(adresList.get(l).toString());
        }
    } */

/*
Przyklad !!!
public static int getNumberOfRounds() {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter number of rounds you wish to play: ");
        boolean correctValue = false;
        int value = 0;
        do {
            String input = in.next();
            try {
                value = Integer.parseInt(input);
                correctValue = value >= 1;
                correctValue = true;
            } catch (Exception e) {
                System.out.println("Incorrect value.");
            }
        } while (!correctValue);
        return value;
    }

    Map<Contrahent, Adress> contrahentsInfo = new HashMap<>();
            contrahentsInfo.put(s, f);
 */

