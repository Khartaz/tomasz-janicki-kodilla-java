package com.kodilla.contractorApp;

import java.util.LinkedHashMap;
import java.util.Map;

class Adress {
    private String street;
    private int postCode;
    private String city;
    private String adresType;
    Map<String, Adress> adresList = new LinkedHashMap<>();


    public Adress(String street, int  postCode, String city) {
        this.street = street;
        this.postCode = postCode;
        this.city = city;
        this.adresType = adresType;
    }

    public void newAdresMap(String street, int postCode, String city) {
        adresList.put(adresType, new Adress(street, postCode, city));
    }
    public String toString() {
        return " Adres type: " + adresType + " Street: " + street + " Post code: " + postCode + " City: " + city;
    }

    public String getAdresType() {
        return adresType;
    }

    public String getStreet() {
        return street;
    }

    public int getPostCode() {
        return postCode;
    }

    public String getCity() {
        return city;
    }
}

/*
public void see() {
        System.out.println("Adres is: " + getAdresType() + "Street: " + getStreet() + "Post Code: " + getPostCode() + "City: "+ getCity());
    }
 */