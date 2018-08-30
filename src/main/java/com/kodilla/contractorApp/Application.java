package com.kodilla.contractorApp;

import javax.sound.midi.Soundbank;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        HashMap<String, Contrahent> kontrahent = new HashMap<>();
        List<Contrahent> contrahents = new LinkedList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Menu: ");
        //Contrahent kontrahent2 = Contrahent.createContrahent(in);

        //while (in.hasNext())
            System.out.println("Enter Name: ");
            String name = in.next();
            System.out.println("Enter LastName: ");
            String lastName = in.next();
            System.out.println("Enter Pin: ");
            String nip = in.next();
            Contrahent kontrahent1 = new Contrahent(name, lastName, nip);

            System.out.println("Adres Type: ");
            String adresType = in.next();
            System.out.println("Street: ");
            String street = in.next();
            System.out.println("PostCode: ");
            int postCode = in.nextInt();
            System.out.println("City: ");
            String city = in.next();
            kontrahent1.newAdresMap(adresType, street, postCode, city);
            contrahents.add(kontrahent1);

        for(Contrahent s : contrahents) {
            s.see();
        }
        /*

        Contrahent kontrahen = Contrahent.createContrahent(in);

        Contrahent kontrahent1 = new Contrahent("Tomasz", "Janicki", "8484848484");
        kontrahent1.newAdresMap("Dostawca","Bydgoska", 5553, "tdasd");
        kontrahent1.newAdresMap("Domowy","Bydgoska", 5553, "tdasd");
        Contrahent kontrahent2 = new Contrahent("adsd", "adasd", "22321313");
        kontrahent2.newAdresMap("Dostawca", "dasdsa", 553432, "asdasd");
        kontrahent2.newAdresMap("Domowy", "dqeeqw", 553432, "asdasd");

        contrahents.add(kontrahent1);
        contrahents.add(kontrahent2);




        for(Contrahent s : contrahents) {
        }


        System.out.println(kontrahent);

        */
        // kontrahent.put(new Kontrahent("Tomasz", "Janicki", "8484848484")).newAdresMap("Bydgoska", 55552, "Torun");

        //  kontrahent.get("Dostawca").see();
        // kontrahent.put("Dostawca", new Contrahent("Tomasz", "Janicki", "8484848484")).newAdresMap("Bydgoska", 55552, "Torun");\
    }
}
