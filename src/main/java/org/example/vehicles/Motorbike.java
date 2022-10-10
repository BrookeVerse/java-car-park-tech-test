package org.example.vehicles;

import org.example.parking.ParkingSpace;

import static org.example.vehicles.VehicleType.*;

//Each vehicle takes up a certain amount of space. I need to set and get how much space it takes
//Motorcycle takes up one motorcycle/car/van space.
public class Motorbike extends Vehicle{
    int spaceNeeded;
    public Motorbike() {
        spaceNeeded = 1;
    }

    @Override
    public boolean fitInSpace(ParkingSpace space) {
        return space.getSize() == van ||space.getSize() == car || space.getSize() == van;
    }

    public static class VehicleFactory {

    }
}
