package com.kodilla.orderListApp;

import java.util.LinkedHashSet;

class Application {

    public static void main(String[] args) {
        LinkedHashSet<OrderInfo> listOfOrders = new LinkedHashSet<>();
        listOfOrders.add(new OrderInfo(20, 2018, 3,30));
        listOfOrders.add(new OrderInfo(21, 2018, 3,30));
        listOfOrders.add(new OrderInfo(22, 2018, 3,30));
        listOfOrders.add(new OrderInfo(23, 2018, 3,30));
        listOfOrders.add(new OrderInfo(24, 2018, 3,30));
        listOfOrders.add(new OrderInfo(24, 2018, 3,30));
        System.out.println(listOfOrders.size());
        System.out.println(listOfOrders);
    }
}
