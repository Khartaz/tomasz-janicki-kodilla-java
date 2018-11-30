package com.kodilla.patterns.challenges.service.food2;

import java.util.Arrays;

public class Application {

    public static void main(String[] args) {
        CustomerDto customer = new CustomerDto("Tomasz", "Krakowska 31, Warszawa");
        OrderItemDto item1 = new OrderItemDto(new Product("Maslo", "Mlekovita"), 100L);
        OrderItemDto item2 = new OrderItemDto(new Product("Mleko 0%", "Mlekovita"), 10L);
        OrderItemDto item3 = new OrderItemDto(new Product("Chleb fit", "Mlekovita"), 1L);

        OrderRequest orderRequest = new OrderRequest(customer, Arrays.asList(item1, item2, item3));

        OrderService service = new OrderService();
        boolean isExecuted = service.process(orderRequest);
        if(isExecuted) {
            System.out.print("Zamówienie zostało przetworzone");
        } else {
            System.out.print("Coś poszło nie tak");
        }
    }
}
