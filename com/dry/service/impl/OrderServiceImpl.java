package com.dry.service.impl;

public class OrderServiceImpl {

    private void processOrder(double total, String typeOrder){
        if (total < 0) {
            System.out.println("Total cannot be negative");
        } else if (total == 0) {
            System.out.println("Order total is zero");
        } else {
            System.out.println("Processing online order: " + total);
        }
    }


    public void processOnlineOrder(double total) {
        processOrder(total, "online");
    }

    public void processInStoreOrder(double total) {
        processOrder(total, "inStore");

    }
}