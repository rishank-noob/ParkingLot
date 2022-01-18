package com.example.parkinglot.model;

import com.example.parkinglot.service.*;
import java.util.List;
import java.util.Map;

public class Level {
    private final Map<Vehicle, List<Spot>> emptyParkingSpotsMap;
    private final Map<Vehicle, List<Spot>> occupiedParkingSpotsMap;
    private final DisplayBoard displayBoard;

    public ParkingFloor(Map<Vehicle, List<Spot>> emptyParkingSpotsMap, Map<Vehicle,
            List<Spot>> occupiedParkingSpotsMap, DisplayBoard displayBoard) {
        this.emptyParkingSpotsMap = emptyParkingSpotsMap;
        this.occupiedParkingSpotsMap = occupiedParkingSpotsMap;
        this.displayBoard = displayBoard;
    }
}
