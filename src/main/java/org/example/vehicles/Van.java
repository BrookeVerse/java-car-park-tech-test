package org.example.vehicles;

import org.example.parking.ParkingSpace;

import static org.example.vehicles.VehicleType.van;


//Each vehicle takes up a certain amount of space. I need to set and get how much space it takes
//Van takes up one van spaces which equals three car spaces.
public class Van extends Vehicle{
    int spaceNeeded;
    public Van() {
        spaceNeeded = 3;
    }

    @Override
    public boolean fitInSpace(ParkingSpace space) {
       return space.getSize() == van;
    }



    }

