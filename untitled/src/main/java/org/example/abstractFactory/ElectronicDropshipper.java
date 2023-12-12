package org.example.abstractFactory;

public class ElectronicDropshipper implements Dropshipper{
    @Override
    public Order createItem() {
        return new ElectronicProduct("AirPods 2");
    }
}
