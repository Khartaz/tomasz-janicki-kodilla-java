package com.kodilla.contractorApp;


import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        HashMap<String, Contrahent> kontrahent = new HashMap<>();
        List<Contrahent> contrahents = new LinkedList<>();

        Contrahent kontrahent1 = new Contrahent("Tomasz", "Janicki", "8484848484");
        kontrahent1.newAdresMap("Dostawca","Bydgoska", 5553, "tdasd");
        kontrahent1.newAdresMap("Domowy","Bydgoska", 5553, "tdasd");
        Contrahent kontrahent2 = new Contrahent("adsd", "adasd", "22321313");
        kontrahent2.newAdresMap("Dostawca", "dasdsa", 553432, "asdasd");
        kontrahent2.newAdresMap("Domowy", "dqeeqw", 553432, "asdasd");

        contrahents.add(kontrahent1);
        contrahents.add(kontrahent2);

        for(Contrahent s : contrahents) {
                s.see();
            }


        // scanner in









        // kontrahent.put(new Kontrahent("Tomasz", "Janicki", "8484848484")).newAdresMap("Bydgoska", 55552, "Torun");

        //  kontrahent.get("Dostawca").see();
        // kontrahent.put("Dostawca", new Contrahent("Tomasz", "Janicki", "8484848484")).newAdresMap("Bydgoska", 55552, "Torun");\
    }
}
