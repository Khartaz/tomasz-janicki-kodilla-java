package com.kodilla.euklidesApp;

class Euklides {

    public void aglorythm() {
        int a = 255;
        int b = 25;

        while (a != b) {
            if (a > b)
                a -= b;
            else
                b -= a;
        }
        System.out.println(a);
    }
}
