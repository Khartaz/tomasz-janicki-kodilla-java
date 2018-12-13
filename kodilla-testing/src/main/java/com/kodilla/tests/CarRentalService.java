package com.kodilla.tests;

import java.time.LocalDateTime;

public class CarRentalService {

    public boolean rent(final User user, final LocalDateTime carRentFrom, final LocalDateTime carRentTo) {
        System.out.println("Renting Caro for " + user.getName() + user.getSurname() +
                            " from " + carRentFrom.toString() + " to: " + carRentTo.toString());

        return true;
    }
}
