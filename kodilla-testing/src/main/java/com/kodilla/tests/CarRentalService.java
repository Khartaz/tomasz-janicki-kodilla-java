package com.kodilla.patterns.challenges;

import java.time.LocalDate;

public class CarRentalService {
    public boolean ren(final User user, final LocalDate carRentFrom, final LocalDate carRentTo) {
        System.out.println("Renting Caro for " + user.getName() + user.getSurname() +
                            " from " + carRentFrom.toString() + " to: " + carRentTo.toString());

        return true;
    }
}
