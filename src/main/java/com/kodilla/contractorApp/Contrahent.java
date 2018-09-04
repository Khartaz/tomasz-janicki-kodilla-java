package com.kodilla.contractorApp;

public class Contrahent {
    private final String name;
    private final String lastName;
    private final String nip;

    public Contrahent(String name, String lastName, String nip) {
        this.name = name;
        this.lastName = lastName;
        this.nip = nip;
    }
    @Override
    public String toString() {
        return "Name is: " + name + " " + lastName + " Nip number is: " + nip;
    }
}

/*
public void see() {
        for(String l : adresList.keySet()) {
            System.out.println(adresList.get(l).toString());
        }
    }
/*
Przyklad !!!
public static int getNumberOfRounds() {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter number of rounds you wish to play: ");
        boolean correctValue = false;
        int value = 0;
        do {
            String input = in.next();
            try {
                value = Integer.parseInt(input);
                correctValue = value >= 1;
                correctValue = true;
            } catch (Exception e) {
                System.out.println("Incorrect value.");
            }
        } while (!correctValue);
        return value;
    }

    Map<Contrahent, Adress> contrahentsInfo = new HashMap<>();
            contrahentsInfo.put(s, f);
 */

