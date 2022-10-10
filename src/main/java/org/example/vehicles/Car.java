package org.example.vehicles;


import org.example.VehicleType;
import org.example.parking.CarSpace;

import static org.example.VehicleType.car;

//Each vehicle takes up a certain amount of space. I need to set and get how much space it takes
//Car takes up one Car or van space.
public class Car extends Vehicle{
    public Car() {
    int spaceNeeded = 1;
    VehicleType size = car;
    }
    @Override
    public boolean fitInSpace(CarSpace space) {
        return space.getType() == car;
    }
}
