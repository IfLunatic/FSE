package org.example.builder;

public class DropShippingOrderBuilder {

    private DropShippingOrder order;

    public DropShippingOrderBuilder() {
        this.order = new DropShippingOrder();
    }

    public DropShippingOrderBuilder setProductName(String productName) {
        order.setProductName(productName);
        return this;
    }

    public DropShippingOrderBuilder setQuantity(int quantity) {
        order.setQuantity(quantity);
        return this;
    }

    public DropShippingOrderBuilder setCustomerAddress(String customerAddress) {
        order.setCustomerAddress(customerAddress);
        return this;
    }

    public DropShippingOrderBuilder setShippingMethod(String shippingMethod) {
        order.setShippingMethod(shippingMethod);
        return this;
    }

    public DropShippingOrder build() {
        return order;
    }
}
