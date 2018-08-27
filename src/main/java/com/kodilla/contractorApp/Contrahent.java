package com.kodilla.contractorApp;

import java.util.HashMap;
import java.util.Map;

public class Contrahent {
    private String name;
    private String lastName;
    private String nip;

    private Map<String, Adress> list = new HashMap<String, Adress>();


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

