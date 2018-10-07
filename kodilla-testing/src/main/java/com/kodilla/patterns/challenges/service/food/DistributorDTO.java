package com.kodilla.patterns.challenges.service.food;

import java.util.List;

public class ProducentDTO {
    private List<Producent> producent;

    public ProducentDTO(List<Producent> producent) {
        this.producent = producent;
    }

    public List<Producent> getProducent() {
        return producent;
    }
}
