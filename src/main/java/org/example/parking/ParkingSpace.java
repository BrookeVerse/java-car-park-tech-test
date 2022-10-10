package org.example.parking;

import org.example.vehicles.Van;
import org.example.vehicles.Vehicle;

public class ParkingSpace {

    private Van.VehicleType size;
    private Vehicle vehicle;
    private int spaceNumber;

    public ParkingSpace(Van.VehicleType size, Vehicle vehicle, int spaceNumber) {
        this.size = size;
        this.vehicle = vehicle;
        this.spaceNumber = spaceNumber;
    }

    public boolean isAvailable(){
        return vehicle == null;
    }

    public boolean canFitVehicle(Vehicle vehicle){
        return isAvailable() && vehicle.fitInSpace(this);
    }

    public int getSpaceNumber() {
        return spaceNumber;
    }

    public Van.VehicleType getSize() {
        return size;
    }
}
