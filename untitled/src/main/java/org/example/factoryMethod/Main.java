package org.example.factoryMethod;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("What do you want to buy?");
        System.out.println("1. T-Shirt");
        System.out.println("2. Sneakers");
        System.out.println("3. Headsets");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        Product product = createProduct(choice);

        if (product != null) {
            System.out.println("You have bought:");
            product.display();
        } else {
            System.out.println("Invalid choice. No purchase made.");
        }
    }

    private static Product createProduct(int choice) {
        ProductFactory productFactory = null;

        switch (choice) {
            case 1:
                productFactory = new TShirtFactory();
                break;
            case 2:
                productFactory = new SneakersFactory();
                break;
            case 3:
                productFactory = new HeadsetsFactory();
                break;
            default:
                break;
        }

        if (productFactory != null) {
            return productFactory.createProduct();
        } else {
            return null;
        }
    }
}

