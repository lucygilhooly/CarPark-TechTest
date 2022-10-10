package org.example;

import java.util.ArrayList;

public class CarPark {

    CarSpace carSpaces = new CarSpace(100);
    MotorcycleSpace motorcycleSpaces = new MotorcycleSpace(20);
    VanSpace vanSpaces = new VanSpace(10);

    ArrayList<Space> parkingSpaces = new ArrayList<>();
    ArrayList<Vehicle> vehicles = new ArrayList<>();
//    ArrayList<Space> availableSpaces = new ArrayList<>();

    void buildCarPark(){
        parkingSpaces.add(carSpaces);
        parkingSpaces.add(motorcycleSpaces);
        parkingSpaces.add(vanSpaces);
        System.out.println(parkingSpaces);
    }

    void makeCar(){
        VehicleFactory vehicleFactory = new VehicleFactory();
        vehicles.add(vehicleFactory.buildVehicle(Type.CAR));

    }


    public static void main(String[] args) {
       CarPark carPark = new CarPark();
       carPark.buildCarPark();
       carPark.makeCar();

    }
}