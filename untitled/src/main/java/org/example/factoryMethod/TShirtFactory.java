package org.example.factoryMethod;

public class TShirtFactory implements ProductFactory {
    @Override
    public Product createProduct() {
        return new TShirt();
    }
}
