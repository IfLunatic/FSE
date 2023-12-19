package org.example.module;


public class Market {
    private static volatile Market instance;

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    private Market() {

    }

    public static Market getInstance() {
        if (instance == null) {
            synchronized (Market.class) {
                if (instance == null) {
                    instance = new Market();
                }
            }
        }
        return instance;
    }
}
