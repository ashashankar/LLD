package com.myplayground.lldprojects.ParkingLot;

import com.myplayground.lldprojects.ParkingLot.VehicleType.Vehicle;
import com.myplayground.lldprojects.ParkingLot.VehicleType.VehicleType;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

public class ParkingLevel {
    @Getter
    private int levelNumber;
    @Getter
    @Setter
    private ArrayList<ParkingSpot> parkingSpots;
    public ParkingLevel (int floor, int numberOfSpots) {
        this.levelNumber = floor;
        this.parkingSpots = new ArrayList<>(numberOfSpots);
        int s = numberOfSpots / 4;
        int next = s+1;
        int nextOne = next + 25+1;
        for (int i=1; i<=s; i++) {
            ParkingSpot spot = new ParkingSpot(i);
            spot.setVehicleType(VehicleType.CAR);
             parkingSpots.add(spot);
        }

        for (int i=next; i<= next+s; i++) {
            ParkingSpot spot = new ParkingSpot(i);
            spot.setVehicleType(VehicleType.TRUCK);
            parkingSpots.add(spot);
        }

        for (int i=nextOne; i<= nextOne + s; i++) {
            ParkingSpot spot = new ParkingSpot(i);
            spot.setVehicleType(VehicleType.MOTORBIKE);
            parkingSpots.add(spot);
        }
    }

    public synchronized boolean parkVehicle(Vehicle vehicle) {
        for (ParkingSpot spot : parkingSpots) {
            if (spot.isAvailable() && spot.getVehicleType() == vehicle.getVehicleType()) {
                spot.parkVehicle(vehicle);
                return true;
            }
        }
        return false;
    }

    public synchronized boolean unParkVehicle(Vehicle vehicle) {
        for (ParkingSpot spot : parkingSpots) {
            if (!spot.isAvailable() && spot.getParkedVehicle().equals(vehicle)) {
                spot.unParkVehicle(vehicle);
                return true;
            }
        }
        return false;
    }

    public void displayAvailability() {
        System.out.println(" Availability for Floor "+ levelNumber);
        for (ParkingSpot spot : parkingSpots) {
            System.out.println(" spot number "+ spot.getSpotNumber() + " is "+ (spot.isAvailable()? "Available" : "Occupied") + "  Vehicle Type "+ spot.getVehicleType());
        }
    }
}
