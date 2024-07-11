package com.myplayground.lldprojects.ParkingLot;

import com.myplayground.lldprojects.ParkingLot.VehicleType.Car;
import com.myplayground.lldprojects.ParkingLot.VehicleType.MotorBike;
import com.myplayground.lldprojects.ParkingLot.VehicleType.Truck;
import com.myplayground.lldprojects.ParkingLot.VehicleType.Vehicle;

public class ParkingLotDemo {

    public static void main(String[] args) {
        ParkingLot parkingLot = ParkingLot.getInstance();
        parkingLot.addLevel(new ParkingLevel(1, 100));
        parkingLot.addLevel(new ParkingLevel(2, 80));


        Vehicle car = new Car("ABC123");
        Vehicle truck = new Truck("XYZ789");
        Vehicle motorcycle = new MotorBike("M1234");

        parkingLot.parkVehicle(car);
        parkingLot.parkVehicle(truck);
        parkingLot.parkVehicle(motorcycle);

        // Display availability
        parkingLot.displayAvailability();

        // Unpark vehicle
        parkingLot.unparkVehicle(motorcycle);

        // Display updated availability
        parkingLot.displayAvailability();
    }
}
