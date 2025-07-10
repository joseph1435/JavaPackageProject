package myapp;

import myapp.classes.*;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("Buddy");
        dog.setBreed("Labrador");
        dog.makeSound();

        Car car = new Car();
        car.setModel("Toyota");
        car.setFuelType("Petrol");
        car.start();

        Laptop laptop = new Laptop();
        laptop.setBrand("Dell");
        laptop.powerOn();

        Robot robot = new Robot();
        robot.setId("RX-78");
        robot.startWork();

        Food food = new Food();
        food.setName("Rice");
        food.prepare();
    }
}
