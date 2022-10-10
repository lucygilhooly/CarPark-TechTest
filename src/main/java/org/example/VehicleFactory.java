package org.example;

public class VehicleFactory {
    // in here pass all three vehicle types in and allow any type to be built

    public Vehicle buildVehicle(Type type){

        switch(type){
            case CAR:
                return new Car(Vehicle.makeBrand(), 4, Vehicle.nextNewId());

            case MOTORCYCLE:
                return new Motorcycle(Vehicle.makeBrand(), 2, Vehicle.nextNewId());

            case VAN:
                return new Van(Vehicle.makeBrand(), 4, Vehicle.nextNewId());
        }

    }


}
