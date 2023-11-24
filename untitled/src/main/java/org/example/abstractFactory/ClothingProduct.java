package org.example.abstractFactory;


public class ClothingProduct implements Order {
    private String name;

    public ClothingProduct(String name) {
        this.name = name;
    }

    @Override
    public void ship() {
        System.out.println("Shipping clothing product: " + name);
    }
}
