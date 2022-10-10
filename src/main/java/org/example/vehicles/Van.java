package org.example.vehicles;


import org.example.VehicleType;
import org.example.parking.CarSpace;

import static org.example.VehicleType.van;

//Each vehicle takes up a certain amount of space. I need to set and get how much space it takes
//Van takes up one van spaces which equals three car spaces.
public class Van extends Vehicle{
    public Van() {
        int spaceNeeded = 3;
        VehicleType size = van;
    }
    @Override
    public boolean fitInSpace(CarSpace space) {
        return space.getSize == van;
    }
}
