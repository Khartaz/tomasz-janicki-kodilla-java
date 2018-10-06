package com.kodilla.patterns.challenges.service.food;

import java.util.List;

public class Distributor {
    private String distributorTitle;
    List<Producent> producentList;

    public Distributor(String distributorTitle) {
        this.distributorTitle = distributorTitle;
    }

    public String getDistributorTitle() {
        return distributorTitle;
    }

}
