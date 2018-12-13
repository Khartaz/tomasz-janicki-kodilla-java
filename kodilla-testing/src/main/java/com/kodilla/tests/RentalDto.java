package com.kodilla.tests;

public class RentalDto {
    public User user;
    private  boolean isRented;

    public RentalDto(User user, boolean isRented) {
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
