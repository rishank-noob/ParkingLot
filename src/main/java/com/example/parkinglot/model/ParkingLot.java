package com.example.parkinglot.model;

import java.util.List;

public class ParkingLot {
    private final List<Level> levels;
    List<Entry> entry = new List<Entry>();
    List<Exit> exit = new List<Exit>();

    public Spot parkVehicle(Vehicle vehicle) {
        for (Level floor : levels) {
            if (floor.hasSpace(vehicle)) {
                Spot parkingSpot = floor.parkVehicle(vehicle);
                return parkingSpot;
            }
        }
        throw new RuntimeException("All floors are already full");
    }
}
