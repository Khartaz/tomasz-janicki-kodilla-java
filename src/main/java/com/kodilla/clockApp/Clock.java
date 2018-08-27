package com.kodilla.clockApp;

class Clock {
    private int hours;
    private int minuts;

    public Clock(int hours, int minuts) {
        this.hours = hours;
        this.minuts = minuts;
    }

    public void addTime() {
        minuts++;
        if( 60 == minuts) {
            hours++;
            minuts = 0;
            if( hours == 24 ){
                hours = 0;
            }
        }
    }

    public int getHours() {
        return this.hours;
    }

    public int getMinuts() {
        return minuts;
    }

    public String toString() {
        return " Hour " + hours + ":" + minuts;
    }
}
