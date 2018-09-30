package com.kodilla.patterns.challenges;

public class Application {
    RentRequestRetrievier rentRequestRetrievier = new RentRequestRetrievier();
    RentRequest rentRequest = rentRequestRetrievier.retrieve();

    RentalProcessor rentalProcessor = new RentalProcessor(
            new MailServie(), new CarRentalService(), new CarRentalRepository());
    rentalProcessor.process(rentRequest);
}
