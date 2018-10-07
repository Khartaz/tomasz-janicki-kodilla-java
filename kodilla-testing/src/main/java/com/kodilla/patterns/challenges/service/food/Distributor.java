package com.kodilla.patterns.challenges.service.food;

import java.util.List;

public class Distributor {
    private String distributorTitle;
    List<Producent> producentList;
    private List<String> distributorList;

    public Distributor(String distributorTitle) {
        this.distributorTitle = distributorTitle;
    }

    public String getDistributorTitle() {
        return distributorTitle;
    }

    public void addDistributor(String distributorTitle) {
         distributorList.add(distributorTitle);
    }
}
