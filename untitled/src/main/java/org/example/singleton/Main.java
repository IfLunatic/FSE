package org.example.singleton;

public class Main {
    public static void main(String[] args) {
        Headphones headphones = Headphones.getInstance();
        Headphones headphones2 = Headphones.getInstance();

        System.out.println(headphones2.equals(headphones));
        System.out.println(headphones2 == headphones);

    }
}
