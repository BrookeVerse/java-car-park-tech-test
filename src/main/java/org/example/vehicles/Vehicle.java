package org.example.vehicles;
import org.example.ParkingLot;
import org.example.VehicleType;


import java.util.ArrayList;

public abstract class Vehicle {

    private VehicleType type;
    private int spaceNeeded;

    private ArrayList<ParkingLot> parkingSpaces = new ArrayList<ParkingLot>();


    public VehicleType getType() {
        return type;
    }

    public int getSpaceNeeded() {
        return spaceNeeded;
    }

    public void parkInSpace(ParkingLot space) {
        parkingSpaces.add(space);
    }

    public abstract boolean fitInSpace(ParkingLot space);
}
