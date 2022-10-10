package org.example.parking;

import org.example.VehicleType;
import org.example.vehicles.Vehicle;

//This is the smallest space and can only take in Motocycles
public class MotorbikeSpace {
    private Vehicle type;
    private VehicleType size;
    private int parkingSpace;

    public MotorbikeSpace(Vehicle type, VehicleType size, int parkingSpace) {
        this.type = type;
        this.size = size;
        this.parkingSpace = parkingSpace;
    }

    public int getParkingSpace() {
        return parkingSpace;
    }

    public VehicleType getType() {
        return size;
    }


    public boolean spaceAvailable() {
        return type == null;
    }
    public boolean canfitVehicle(Vehicle type) {
        return spaceAvailable() && type.fitInSpace(this);
    }

    public boolean parking(Vehicle type){
        if (!canfitVehicle(type)) {
            return false;
        }
        type.parkInSpace(this);
        return true;
    }
}
