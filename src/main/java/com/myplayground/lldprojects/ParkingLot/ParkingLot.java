package com.myplayground.lldprojects.ParkingLot;

import com.myplayground.lldprojects.ParkingLot.VehicleType.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
   List<ParkingLevel> parkingLevels;
   private static ParkingLot parkingLot;

   private ParkingLot() {
      parkingLevels = new ArrayList<>();
   }

   public static synchronized ParkingLot getInstance() {
      if(parkingLot == null) {
         parkingLot = new ParkingLot();
      }
      return parkingLot;
   }

   public boolean parkVehicle(Vehicle vehicle) {
      for (ParkingLevel level : parkingLevels) {
         if (level.parkVehicle(vehicle)) {
            return true;
         }
      }
      return false;
   }

   public boolean unparkVehicle(Vehicle vehicle) {
      for (ParkingLevel level : parkingLevels) {
         if (level.unParkVehicle(vehicle)) {
            return true;
         }
      }
      return false;
   }

   public void displayAvailability() {
      for (ParkingLevel level : parkingLevels) {
        level.displayAvailability();
      }
   }

   public void addLevel(ParkingLevel level) {
      parkingLevels.add(level);
   }
}


