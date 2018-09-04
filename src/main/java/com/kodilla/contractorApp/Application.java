package com.kodilla.contractorApp;

import java.util.*;

public class Application {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<Contrahent, List<Adress>> contrahentListMap = new LinkedHashMap<>();

        String street, city;
        int postCode;


        String name = TerminalController.getName();
        String lastName = TerminalController.getLastName();
        String nip = TerminalController.getNip();

        Contrahent contrahent = new Contrahent(name, lastName, nip);

        System.out.println("Add Adres" );
        System.out.println("Enter street");
        street = in.next();
        System.out.println("Enter post code");
        postCode = in.nextInt();
        System.out.println("Enter city");
        city = in.next();

        Adress adress = new Adress(street, postCode, city, AdressType.HOME);
        contrahentListMap.put(contrahent, Arrays.asList(adress));

        for(Map.Entry entry : contrahentListMap.entrySet()) {
            System.out.println(entry.getKey().toString() + " " + entry.getValue().toString());
        }


        /*
        Adress d = adresList.put(adresType, adress);
        listOf.put(contrahent, d);

        for(Contrahent s : contrahentsList) {
            System.out.println(adresList.get(s));

        }

        //System.out.println(adresList);
        */
    }

}

//char quit = 'Y';
//while(quit == 'Y') {

//System.out.println("Add Contrahent? Press\n 1. Yes \n2. No");
                /*

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

