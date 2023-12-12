package org.example.abstractFactory;

public class ElectronicProduct implements Order{
    private String name;

    public ElectronicProduct(String name) {
        this.name = name;
    }

    @Override
    public void ship() {
        System.out.println("Shipping electronic product: " + name);
    }
}
