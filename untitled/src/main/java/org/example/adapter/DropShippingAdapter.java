package org.example.adapter;

public class DropShippingAdapter implements DropShippingService {
    private LegacyShippingService legacyShippingService;

    public DropShippingAdapter(LegacyShippingService legacyShippingService) {
        this.legacyShippingService = legacyShippingService;
    }

    @Override
    public void processOrder(String productId, int quantity) {
        legacyShippingService.ship(productId, quantity);
    }
}
