package org.example;

public class Van extends Vehicle {
    public Van(String brand, int wheels, int vehicleId) {
        super(brand, wheels, vehicleId);
    }

    @Override
    public String toString() {
        return "Van{" +
                "brand='" + brand + '\'' +
                ", wheels=" + wheels +
                ", vehicleId=" + vehicleId +
                '}';
    }

}
