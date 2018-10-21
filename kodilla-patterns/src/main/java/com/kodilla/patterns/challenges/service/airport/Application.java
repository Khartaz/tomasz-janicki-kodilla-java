package com.kodilla.patterns.challenges.service.airport;

public class Application {
    public static void main(String[] args) {
        AirportSearch airportSearch = new AirportSearch();

        System.out.println(airportSearch.searchFlightFrom("Rzeszow"));

        //System.out.println(airportSearch.searchFlightTo("Eindhoven"));

        System.out.println(airportSearch.searchFlightFromByTo("Gdansk", "Londyn"));
    }
}
