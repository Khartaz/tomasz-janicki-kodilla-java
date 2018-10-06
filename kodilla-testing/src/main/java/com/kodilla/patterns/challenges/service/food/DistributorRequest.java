package com.kodilla.patterns.challenges.service.food;

import java.util.ArrayList;
import java.util.List;

public class DistributorRequest {
    private List<Producent> producent;

    public DistributorRequest(List<Producent> producent) {
        this.producent = producent;
    }

    public List<Producent> getProducent() {
        return new ArrayList<>(producent);
    }
}
