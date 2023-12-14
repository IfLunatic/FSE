package org.example.adapter;

public class LegacyShippingService {

    public void ship(String itemCode, int amount) {
        System.out.println("Legacy shipping item: " + itemCode + ", Quantity: " + amount);
    }

}
