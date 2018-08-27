package com.kodilla.canonApp;


import java.util.LinkedList;

class Application {
    public static void main(String[] args) {
        LinkedList<Cannon> cannonList = new LinkedList<Cannon>();
        cannonList.addLast(new Cannon("Kula zielona", true));
        cannonList.addLast(new Cannon("Kula niebieska", false));
        cannonList.addLast(new Cannon("Kula czerwona", false));
        cannonList.addLast(new Cannon("Kula zolta", true));
        cannonList.addLast(new Cannon("Kula bombowa", false));
        System.out.println(cannonList);
        for(Cannon cannon : cannonList) {
            if(cannon.loaded == false) {
                System.out.println("Cannon empty...");
                cannon.fire();
            }
        }
        System.out.println(cannonList);
    }
}
