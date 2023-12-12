package org.example.builder;

public class Main {
    public static void main(String[] args) {
        DropShippingOrderBuilder builder = new DropShippingOrderBuilder();
        DropShippingOrder order = builder.setProductName("Product A")
                .setQuantity(10)
                .setCustomerAddress("123 Main St, City")
                .setShippingMethod("Express Shipping")
                .build();

        System.out.println(order);
    }
}
