package com.myplayground.lldprojects.ParkingLot.VehicleType;

import lombok.Getter;

public abstract class Vehicle {
    String vehicleIdentificationNumber;
    @Getter
    VehicleType vehicleType;

    public Vehicle(String vehicleIdentificationNumber, VehicleType type) {
        this.vehicleIdentificationNumber = vehicleIdentificationNumber;
        this.vehicleType = type;
    }

}
