package com.kodilla.canonApp;

class Cannon {
    String cannon;
    boolean loaded;

    public Cannon(String cannon, boolean loaded) {
        this.cannon = cannon;
        this.loaded = loaded;
    }
    public boolean fire() {
        return loaded = true;
    }
    public String toString() {
        return " Ball " + cannon  + " Cannon...Loaded " + loaded + "\n";
    }
}