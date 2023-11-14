package org.example.factoryMethod;

public class SneakersFactory implements ProductFactory{
    @Override
    public Product createProduct() {
        return new Sneakers();
    }
}
