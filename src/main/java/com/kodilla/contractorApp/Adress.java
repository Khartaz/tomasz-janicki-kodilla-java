package com.kodilla.contractorApp;

class Adress {
    private String street;
    private int postCode;
    private String city;
    private AdressType adresType;


    public Adress(String street, int postCode, String city, AdressType adresType) {
        this.street = street;
        this.postCode = postCode;
        this.city = city;
        this.adresType = adresType;
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

    public AdressType getAdresType() {
        return adresType;
    }

    @Override
    public String toString() {
        return "Adress{" +
                "street='" + street + '\'' +
                ", postCode=" + postCode +
                ", city='" + city + '\'' +
                ", adresType=" + adresType +
                '}';
    }
}

/*
public void see() {
        System.out.println("Adres is: " + getAdresType() + "Street: " + getStreet() + "Post Code: " + getPostCode() + "City: "+ getCity());
    }
 */