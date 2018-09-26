package com.kodilla.patterns.challenges;

import java.util.*;
import java.util.stream.Stream;

public class MovieStore {

    public Map<String, List<String>> getMovies() {

        List<String> ironManTranslations = new ArrayList<>();
        ironManTranslations.add("Żelazny Człowiek");
        ironManTranslations.add("Iron Man");

        List<String> avengersTranslations = new ArrayList<>();
        avengersTranslations.add("Mściciele");
        avengersTranslations.add("Avengers");

        List<String> flashTranslations = new ArrayList<>();
        flashTranslations.add("Błyskawica");
        flashTranslations.add("Flash");

        Map<String, List<String>> booksTitlesWithTranslations = new HashMap<>();
        booksTitlesWithTranslations.put("IM", ironManTranslations);
        booksTitlesWithTranslations.put("AV", avengersTranslations);
        booksTitlesWithTranslations.put("FL", flashTranslations);

        return booksTitlesWithTranslations;
    }

    public void moviesFlatMap() {
                Stream.of(getMovies())
                        .flatMap(v->v.values().stream())
                        .flatMap(v->v.stream())
                        .forEach(s ->System.out.print(s +"!"));
    }

    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        movieStore.moviesFlatMap();
    }
}
