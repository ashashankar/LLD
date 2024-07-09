package com.myplayground.lldprojects.ParkingLot;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

public class ParkingLevel {
    @Getter

    private int levelNumber;
    @Getter
    @Setter
    private ArrayList<ParkingSpot> parkingSpots;
}
