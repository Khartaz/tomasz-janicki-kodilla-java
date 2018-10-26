package com.kodilla.patterns.challenges.service.airport;

import java.util.*;

public class AirportSearch {
    private final static Map<String, List<String>> airportsMap = new HashMap<>();
    static {
        airportsMap.put("Krakow", Arrays.asList("Londyn", "Warszawa", "Rzeszow", "Eindhoven"));
        airportsMap.put("Rzeszow", Arrays.asList("Gdansk", "Warszawa", "Eindhoven", "Krakow"));
    }

    public List<String> searchFlightFrom(String from) {
        List<String> airports = airportsMap.get(from);

        return airports;
    }

    public List<String> searchFlightTo(String from) {
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

    public List<String> searchFlightFromByTo(String to, String via) {
        List<String> airports = new ArrayList<>();
        List<String> startAirports = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : airportsMap.entrySet()) {
            entry.getValue().stream()
                    .filter(p -> p.equals(to))
                    .findFirst()
                    .ifPresent(v -> airports.add(entry.getKey()));
        }

        System.out.println(airports);

        airports.forEach(v -> airportsMap.get(v).stream()
                .filter(p -> p.equals(via))
                .findFirst()
                .ifPresent(x -> startAirports.add(x)));

        return startAirports;
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
