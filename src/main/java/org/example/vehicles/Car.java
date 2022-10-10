package org.example.vehicles;

import org.example.parking.ParkingSpace;

//Each vehicle takes up a certain amount of space. I need to set and get how much space it takes
//Car takes up one Car or van space.
public class Car extends Vehicle{
    int spaceNeeded;
    public Car() {
        spaceNeeded = 1;
    }

    @Override
    public boolean fitInSpace(ParkingSpace space) {
        return space.getSize() == car || space.getSize() == van;
    }
}
