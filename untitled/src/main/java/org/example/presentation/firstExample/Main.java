package org.example.presentation.firstExample;


public class Main {
    public static void main(String[] args) {
        Car car = new Car("red", "dodge");
        System.out.println(car);

        //Без використання паттерна

        Car car2 = new Car(car.color, car.name);
        System.out.println(car2);

        //З використанням паттерна прототип

        Car car3 = car.clone();
        System.out.println(car3);
    }
}
