package org.example.abstractFactory;

public class ClothingDropshipper implements Dropshipper{
    @Override
    public Order createItem() {
        return new ClothingProduct("T-Shirt");
    }
}
