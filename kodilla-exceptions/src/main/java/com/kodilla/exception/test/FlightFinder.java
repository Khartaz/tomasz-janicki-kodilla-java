package com.kodilla.exception.test;

public class FlightFinder {

    public static void main(String[] args) {
        SearchService searchService = new SearchService();
        Flight flight = new Flight("Airport2", "Airport2");
        try {
            boolean result = searchService.findFilght(flight);
            if(result) {
                System.out.println("Flight founded");
            } else {
                System.out.println("Cannot landing");
            }
        } catch (RuntimeException e) {
            System.out.println("Flight not found");
        }
    }
}
