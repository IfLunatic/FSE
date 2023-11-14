package org.example.factoryMethod;

public class HeadsetsFactory implements ProductFactory{
    @Override
    public Product createProduct() {
        return new Headsets();
    }
}
