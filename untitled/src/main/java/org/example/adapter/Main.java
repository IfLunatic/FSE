package org.example.adapter;

public class Main {
    public static void main(String[] args) {
        LegacyShippingService legacyShippingService = new LegacyShippingService();
        DropShippingService dropShippingService = new DropShippingAdapter(legacyShippingService);

        dropShippingService.processOrder("ABC123", 10);
    }
}
