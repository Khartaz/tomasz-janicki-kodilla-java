package com.kodilla.phoneList;


import java.util.ArrayList;

class Phone {
    public void arrayList () {

        ArrayList<String> companies = new ArrayList<String>();
        companies.add("DELL");
        companies.add("APPLE");
        companies.add("SAMSUNG");
        companies.add("SONY");
        companies.add("ALCATEL");

        String e = companies.get(companies.size() - 1);
        String s = ", ";

        for(int i=0; i < companies.size()-1; i++) {
            String result =  companies.get(i);
            System.out.print(result + s);
        }
        System.out.print(e);
    }
}
