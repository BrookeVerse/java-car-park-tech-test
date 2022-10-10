package org.example.parking;

import org.example.ParkingLot;
import org.example.VehicleType;
import org.example.vehicles.Vehicle;

//This is the medium spot that can take in cars and motocycles
public class CarSpace {
    private Vehicle type;
    private VehicleType size;
    private int parkingSpace;

    public CarSpace(VehicleType size, int parkingSpace) {
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
