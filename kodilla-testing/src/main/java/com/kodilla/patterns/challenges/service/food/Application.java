package com.kodilla.patterns.challenges.service.food;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        Distributor distributor1 = new Distributor("Food2Door");
        List<Distributor> distributorList = new ArrayList<>();
        distributorList.add(distributor1);

        ProductInfo productInfo1 = new ProductInfo("Cherry", 30);
        ProductInfo productInfo2 = new ProductInfo("Chocolade", 20);
        ProductInfo productInfo3 = new ProductInfo("Apple", 320);
        List<ProductInfo> productInfoList = new ArrayList<>();
        productInfoList.add(productInfo1);
        productInfoList.add(productInfo2);
        productInfoList.add(productInfo3);


        Producent producent1 = new Producent("ExtraFoodShop");
        Producent producent2 = new Producent("HealthyShop");
        Producent producent3 = new Producent("GlutenFreeShop");
        List<Producent> producentList = new ArrayList<>();
        producentList.add(producent1);
        producentList.add(producent2);
        producentList.add(producent3);

        Customer customer = new Customer("Tom", "Tomms");
        CustomerRequest customerRequest = new CustomerRequest(customer, distributor1);
        CustomerResponseDTO customerResponseDTO = new CustomerResponseDTO(distributor1, productInfoList);


        DistributorRequest distributorRequest = new DistributorRequest(producentList);
        DistributorDTO distributorDTO = new DistributorDTO(producentList, productInfoList);



        ProductRequestRetriever productRequestRetriever = new ProductRequestRetriever();
        ProductRequest productRequest = productRequestRetriever.retrieve();

    }
}
