package org.example.parking;

import org.example.VehicleType;
import org.example.vehicles.Vehicle;

public class ParkingSpace {

    private VehicleType size;
    private Vehicle vehicle;
    private int spaceNumber;

    public ParkingSpace(VehicleType size, Vehicle vehicle, int spaceNumber) {
        this.size = size;
        this.vehicle = vehicle;
        this.spaceNumber = spaceNumber;
    }
}
