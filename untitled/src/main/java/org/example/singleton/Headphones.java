package org.example.singleton;

public class Headphones {
    private static volatile Headphones instance;

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    private Headphones() {

    }

    public static Headphones getInstance() {
        if (instance == null) {
            synchronized (Headphones.class) {
                if (instance == null) {
                    instance = new Headphones();
                }
            }
        }
        return instance;
    }
}
