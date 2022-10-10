package org.example.vehicles;

import org.example.VehicleType;
import org.example.parking.VanSpace;

import static org.example.VehicleType.motorbike;
import static org.example.VehicleType.van;

//Each vehicle takes up a certain amount of space. I need to set and get how much space it takes
//Motorcycle takes up one motorcycle/car/van space.
public class Motorbike {
    int spaceNeeded;

    public Motorbike(int spaceNeeded) {
        this.spaceNeeded = spaceNeeded;
    }

//    public boolean fitInSpace(VanSpace space) {
//        return space.getType() == VehicleType.car || space.getType() == motorbike || space.getType() == van;
//    }


}
