package com.kodilla.contractorApp;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Contrahent {
    private final String name;
    private final String lastName;
    private final String nip;

    private Map<String, Adress> list = new HashMap<String, Adress>();


    public static Contrahent createContrahent(final Scanner scanner) {
       String name = scanner.next();
       String  lastName = scanner.next();
       String nip = scanner.next();

        return new Contrahent(name, lastName, nip);
    }

    /*public void putAction(String name, Runnable Adres) {
        list.put(name, Adres);
    } */

    public Contrahent(String name, String lastName, String nip) {
        this.name = name;
        this.lastName = lastName;
        this.nip = nip;
    }

    public void newAdresMap(String adresType, String street, int postCode, String city) {
        list.put(adresType, new Adress(street, postCode, city));
    }

    public void see() {
        for(String l : list.keySet()) {
            System.out.println(list.get(l).toString());
        }
    }
}

