package com.kodilla.patterns.challenges.service.airport;

import java.util.*;

public class AirportSearch {
    private final Map<String, List<String>> airportsMap = new HashMap<>();

    public List<String> searchFlightFrom(String from) {
        airportsMap.put("Krakow", Arrays.asList("Londyn", "Warszawa", "Rzeszow", "Eindhoven"));
        airportsMap.put("Rzeszow", Arrays.asList("Gdansk", "Warszawa", "Eindhoven", "Krakow"));

        List<String> airports = airportsMap.get(from);

        return airports;
    }

    public List<String> searchFlightTo(String from) {
        airportsMap.put("Krakow", Arrays.asList("Londyn", "Warszawa", "Rzeszow", "Eindhoven"));
        airportsMap.put("Rzeszow", Arrays.asList("Gdansk", "Warszawa", "Eindhoven", "Krakow"));

        List<String> airports = new ArrayList<>();
        try {
            airportsMap.entrySet().forEach(set -> {
                Optional<String> to = set.getValue().stream()
                        .filter(v -> v.equals(from))
                        .findFirst();

                if (to.get() != null) {
                    airports.add(set.getKey());
                }
            });
        } catch (NoSuchElementException e) {
            System.out.println("Brak polaczenia");
        }
        return airports;
    }

    public List<String> searchFlightFromByTo(String from, String airportTo) {
        airportsMap.put("Krakow", Arrays.asList("Londyn", "Warszawa", "Rzeszow", "Eindhoven"));
        airportsMap.put("Rzeszow", Arrays.asList("Gdansk", "Warszawa", "Eindhoven", "Krakow"));

        List<String> airportsFrom = new ArrayList<>();
        List<String> airportsTo = new ArrayList<>();

        try {
            airportsMap.entrySet().forEach(set -> {
                Optional<String> to = set.getValue().stream()
                        .filter(v -> v.equals(from))
                        .findFirst();

                if (to.get() != null) {
                    airportsFrom.add(set.getKey());
                }

            });
        } catch (NoSuchElementException e) {
            System.out.println("Brak polaczenia");
        }
        return airportsTo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AirportSearch that = (AirportSearch) o;
        return Objects.equals(airportsMap, that.airportsMap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(airportsMap);
    }
}
