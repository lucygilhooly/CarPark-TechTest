package org.example;

public class Motorcycle extends Vehicle{

    public Motorcycle(String brand, int wheels, int vehicleId) {
        super(brand, wheels, vehicleId);
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "brand='" + brand + '\'' +
                ", wheels=" + wheels +
                ", vehicleId=" + vehicleId +
                '}';
    }
}
