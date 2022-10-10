package org.example.parking;

import org.example.VehicleType;
import org.example.vehicles.Vehicle;

//This is the largest spot, it takes up three car spaces but can hold all three vehicles
public class VanSpace {
    private Vehicle type;
    private VehicleType size;
    private int parkingSpace;

    public VanSpace(Vehicle type, VehicleType size, int parkingSpace) {
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
