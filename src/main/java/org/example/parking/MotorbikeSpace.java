package org.example.parking;

import org.example.ParkingLot;
import org.example.vehicles.Van;
import org.example.vehicles.Vehicle;

//This is the smallest space and can only take in Motocycles
public class MotorbikeSpace extends ParkingLot {
    private Vehicle type;
    private Van.VehicleType size;
    private int parkingSpace;

    public MotorbikeSpace(Van.VehicleType size, int parkingSpace) {
        super(5);
        this.size = size;
        this.parkingSpace = parkingSpace;
    }

    public int getParkingSpace() {
        return parkingSpace;
    }

    public Van.VehicleType getType() {
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
