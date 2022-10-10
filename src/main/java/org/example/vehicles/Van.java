package org.example.vehicles;


import org.example.ParkingLot;
import org.example.VehicleType;
import org.example.parking.VanSpace;

import static org.example.VehicleType.van;

//Each vehicle takes up a certain amount of space. I need to set and get how much space it takes
//Van takes up one van spaces which equals three car spaces.
public class Van extends Vehicle{
    public Van() {
        int spaceNeeded = 3;
        VehicleType size = van;
    }
    @Override
    public boolean fitInSpace(VanSpace space) {
        return space.getSize == van;
    }

    @Override
    public boolean fitInSpace(ParkingLot space) {
        return space.getSize == van;;
    }
}
