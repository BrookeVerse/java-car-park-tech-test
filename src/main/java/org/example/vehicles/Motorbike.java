package org.example.vehicles;

import org.example.VehicleType;
import org.example.parking.CarSpace;

import static org.example.VehicleType.motorbike;
import static org.example.VehicleType.van;

//Each vehicle takes up a certain amount of space. I need to set and get how much space it takes
//Motorcycle takes up one motorcycle/car/van space.
public class Motorbike extends Vehicle{
    public Motorbike() {
        int spaceNeeded = 1;
        VehicleType size = motorbike;
    }
    @Override
    public boolean fitInSpace(CarSpace space) {
        return space.getType() == VehicleType.car || space.getType() == motorbike || space.getType() == van;
    }
}
