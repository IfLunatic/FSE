package org.example.module;


public class Main {
    public static void main(String[] args) {
        Market marketOne = Market.getInstance();
        Market marketTwo = Market.getInstance();

        System.out.println(marketTwo.equals(marketOne));
        System.out.println(marketTwo == marketOne);

    }
}
