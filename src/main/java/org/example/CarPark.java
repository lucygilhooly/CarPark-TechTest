package org.example;

import java.util.ArrayList;

public class CarPark {

    CarSpace carSpaces = new CarSpace(100);
    MotorcycleSpace motorcycleSpaces = new MotorcycleSpace(20);

    VanSpace vanSpaces = new VanSpace(10);

    ArrayList<Space> parkingSpaces = new ArrayList<>();
//    ArrayList<Space> availableSpaces = new ArrayList<>();

    void buildCarPark(){
        parkingSpaces.add(carSpaces);
        parkingSpaces.add(motorcycleSpaces);
        parkingSpaces.add(vanSpaces);
        System.out.println(parkingSpaces);
    }
//for loop going thru each space type and adding 20 MC spaces, &130 car spaces



    public static void main(String[] args) {
       CarPark carPark = new CarPark();
       carPark.buildCarPark();

    }
}