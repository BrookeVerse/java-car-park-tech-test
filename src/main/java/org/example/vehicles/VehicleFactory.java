package org.example.vehicles;

public class VehicleFactory {

    public Vehicle createVehicles(VehicleType type) {
        switch (type) {
            case motorbike:
                return new Motorbike();
            case car:
                return new Car();
            case van:
                return new Van();
        }
        return null;
    }
}
