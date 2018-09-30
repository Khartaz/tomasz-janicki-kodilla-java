package com.kodilla.tests;

public class RentalToDo {
    public User user;
    public boolean isRented;

    public RentalToDo(User user, boolean isRented) {
        this.user = user;
        this.isRented = isRented;
    }

    public User getUser() {
        return user;
    }

    public boolean isRented() {
        return isRented;
    }
}
