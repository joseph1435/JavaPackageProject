package myapp.classes;

import myapp.abstracts.Vehicle;
import myapp.interfaces.Drivable;

public class Car extends Vehicle implements Drivable {
    private String fuelType;
    private boolean isAutomatic;

    public String getFuelType() { return fuelType; }
    public void setFuelType(String fuelType) { this.fuelType = fuelType; }

    public boolean isAutomatic() { return isAutomatic; }
    public void setAutomatic(boolean automatic) { isAutomatic = automatic; }

    @Override
    public void drive() {
        System.out.println("Driving car...");
    }

    @Override
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }

    @Override
    public void accelerate() {
        System.out.println("Car accelerating...");
    }
}
