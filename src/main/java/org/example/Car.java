package org.example;

public class Car extends Vehicle {
    public Car(String brand, int wheels, int vehicleId) {
        super(brand, wheels, vehicleId);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", wheels=" + wheels +
                ", vehicleId=" + vehicleId +
                '}';
    }
}
