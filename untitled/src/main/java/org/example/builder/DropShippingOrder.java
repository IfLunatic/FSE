package org.example.builder;

public class DropShippingOrder {

    private String productName;
    private int quantity;
    private String customerAddress;
    private String shippingMethod;

    public DropShippingOrder() {
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getShippingMethod() {
        return shippingMethod;
    }

    public void setShippingMethod(String shippingMethod) {
        this.shippingMethod = shippingMethod;
    }

    @Override
    public String toString() {
        return "Order: " + quantity + " x " + productName +
                ", Shipping to: " + customerAddress +
                ", Shipping Method: " + shippingMethod;
    }

}
