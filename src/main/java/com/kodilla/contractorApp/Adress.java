package com.kodilla.contractorApp;

class Adress {
    private String street;
    private int postCode;
    private String city;


    public Adress(String street, int  postCode, String city) {
        this.street = street;
        this.postCode = postCode;
        this.city = city;
    }
    public String toString() {
        return street + postCode + city;
    }

}