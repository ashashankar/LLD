package com.myplayground.lldprojects.ParkingLot;

import com.myplayground.lldprojects.ParkingLot.VehicleType.Vehicle;
import com.myplayground.lldprojects.ParkingLot.VehicleType.VehicleType;
import lombok.Getter;
import lombok.Setter;

public class ParkingSpot {
    private int spotNumber;
    @Getter
    @Setter
    private VehicleType vehicleType;
    @Getter
    @Setter
    private Vehicle parkedVehicle;


}
