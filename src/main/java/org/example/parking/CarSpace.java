package org.example.parking;


import org.example.vehicles.Vehicle;

//This is the medium spot that can take in cars and motocycles
public class CarSpace extends ParkingSpace{

    public CarSpace(VehicleType size, Vehicle vehicle, int spaceNumber) {
        super(size, vehicle, spaceNumber);
    }
}
