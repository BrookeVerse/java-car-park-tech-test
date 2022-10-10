package org.example.vehicles;
import org.example.ParkingLot;
import org.example.VehicleType;

import java.lang.reflect.Array;
import java.util.ArrayList;

public abstract class Vehicle {
    private int spaceNeeded;
    private VehicleType size;
    private ArrayList<ParkingSpace> parkingSpaces = new ArrayList<ParkingSpace>();

    public VehicleType getSize() {
        return size;
    }

    public int getSpaceNeeded() {
        return spaceNeeded;
    }

    public abstract boolean fitInSpace(ParkingSpace space);
}
