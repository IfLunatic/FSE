package org.example.presentation.firstExample;

public class Car {

    public String color;
    public String name;

    public Car(String color, String name) {
        this.color = color;
        this.name = name;
    }

    public Car clone() {
        Car car = new Car(color, name);
        return car;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
