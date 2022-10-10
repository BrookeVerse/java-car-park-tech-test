package org.example.vehicles;


import org.example.VehicleType;
import org.example.parking.VanSpace;

import static org.example.VehicleType.car;

//Each vehicle takes up a certain amount of space. I need to set and get how much space it takes
//Car takes up one Car or van space.
public class Car extends Vehicle{
    int spaceNeeded;
    VehicleType size = car;

    public Car(int spaceNeeded, VehicleType size) {
        super(1, );
        this.spaceNeeded = spaceNeeded;
        this.size = size;
    }
    public boolean fitInSpace() {
        return space.getType() == VehicleType.car || space.getType() == motorbike || space.getType() == van;
    }
    @Override
    public VehicleType getType() {
        return null;
    }

}
