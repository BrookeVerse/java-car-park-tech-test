package org.example;

import org.example.parking.CarSpace;
import org.example.parking.VanSpace;
import org.example.vehicles.Motorbike;
import org.example.vehicles.Vehicle;

import static org.example.VehicleType.*;

public class VehicleFactory {
    public Vehicle createVehicles(VehicleType type) {
        switch (type) {
            case motorbike:
                return new Motorbike(1);
            case car:
                return new CarSpace(car, 1);
            case van:
                return new VanSpace(van, 3);
        }
        return null;
    }
}
