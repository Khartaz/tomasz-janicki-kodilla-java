package com.kodilla.tests;

public class Application {
    public static void main(String[] args) {
        RentRequestRetriever rentRequestRetriever = new RentRequestRetriever();
        RentRequest rentRequest = rentRequestRetriever.retrieve();

        //RentalProcessor rentalProcessor = new RentalProcessor(new CarRentalService(), new CarRentalRepository());
        //rentalProcessor.process(rentRequest);
    }

}
