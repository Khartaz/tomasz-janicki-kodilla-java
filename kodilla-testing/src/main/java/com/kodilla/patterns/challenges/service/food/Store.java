package com.kodilla.patterns.challenges.service.food;

import java.util.ArrayList;
import java.util.List;

public class Store {
    List<Distributor> distributorList = new ArrayList<>();
    private String storeTitle;

    public Store(String storeTitle) {
        this.storeTitle = storeTitle;
    }

    public void addDistributor(Distributor distributor) {
        distributorList.add(distributor);
    }

    public void removeDistributor(Distributor distributor) {
        distributorList.remove(distributor);
    }

    @Override
    public String toString() {
        return "Store{" +
                "distributorList=" + distributorList +
                ", sellerTitle='" + storeTitle + '\'' +
                '}';
    }
}
