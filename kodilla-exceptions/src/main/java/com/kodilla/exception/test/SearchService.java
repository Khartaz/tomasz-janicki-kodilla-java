package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class SearchService {
    public boolean findFilght(Flight flight)  {
        Map<String, Boolean> airports = new HashMap<>();

        airports.put("Airport1", true);
        airports.put("Airport2", false);
        airports.put("Airport3", true);
        airports.put("Airport4", false);
        airports.put("Airport5", true);
        airports.put("Airport6", false);

        if( airports.get(flight.getDepartureAirport()) == null) {
            throw new RouteNotFoundException();
        }
        if(airports.get(flight.getArrivalAirport()) == null) {
            throw new RouteNotFoundException();
        }
        return airports.get(flight.getArrivalAirport());
    }
}
