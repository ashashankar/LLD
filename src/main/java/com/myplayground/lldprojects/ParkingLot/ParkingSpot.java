package com.myplayground.lldprojects.ParkingLot;

import com.myplayground.lldprojects.ParkingLot.VehicleType.Vehicle;
import com.myplayground.lldprojects.ParkingLot.VehicleType.VehicleType;
import lombok.Getter;
import lombok.Setter;

public class ParkingSpot {
    @Getter
    private int spotNumber;
    @Getter
    @Setter
    private VehicleType vehicleType;
    @Getter
    @Setter
    private Vehicle parkedVehicle;
    ParkingSpot(int spotNumber) {
        this.spotNumber = spotNumber;
    }

    public synchronized void parkVehicle(Vehicle vehicle) {
        if (isAvailable() && vehicleType == vehicle.getVehicleType()) {
            parkedVehicle = vehicle;
        }
    }

    public synchronized void unParkVehicle(Vehicle vehicle) {
        if(!isAvailable() && parkedVehicle.equals(vehicle)) {
            parkedVehicle = null;
        }
    }
    public boolean isAvailable() {
        return parkedVehicle == null;
    }

}
