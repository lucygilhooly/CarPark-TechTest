package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Vehicle {
    String brand;
    // use this class to build a standard vehicle and then make each car van and motorbike class extend this one
    // maybe include things like colour, doors, drive function, park function
    // possibly use this as an interface with a drive and park function ??
    int wheels;
    int vehicleId;
    public Vehicle(String brand, int wheels, int vehicleId) {
        this.brand = brand;
        this.wheels = wheels;
        this.vehicleId = vehicleId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public void makeSound(){
        System.out.println("toot toot!!");
    }

    private static int newId = 0;

    public static int nextNewId(){ return ++newId;}

    private static final List<String> brands = new ArrayList<>();
    private static final Random RANDOM = new Random();

    static{
        brands.add("BMW");
        brands.add("Mercedes");
        brands.add("Fiat");
        brands.add("VW");
        brands.add("Ford");
        brands.add("Porsche");
        brands.add("Honda");
        brands.add("Land Rover");
        brands.add("Alpha Romeo");
    }

    public static String makeBrand(){return brands.get(RANDOM.nextInt(brands.size()));}

    public void parkVehicle(){

    }
}
