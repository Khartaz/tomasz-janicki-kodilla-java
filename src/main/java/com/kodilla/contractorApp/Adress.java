package com.kodilla.contractorApp;

import java.util.Scanner;

class Adress {
    private String street;
    private int postCode;
    private String city;


    public Adress(String street, int  postCode, String city) {
        this.street = street;
        this.postCode = postCode;
        this.city = city;
    }

    public static Adress createAdres(final Scanner scanner) {
        String street = scanner.next();
        int postCode = scanner.nextInt();
        String city = scanner.next();

        return new Adress(street, postCode, city);
    }
    public String toString() {
        return street + postCode + city;
    }

}