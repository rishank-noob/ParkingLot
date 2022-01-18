package com.example.parkinglot;

import com.example.parkinglot.model.*;
import com.example.parkinglot.service.ParkingLotService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int noOfLevels = in.nextInt();
        ParkingLotService parkingLotService = new ParkingLotService(noOfLevels);
        for(int i = 0; i<noOfLevels;i++){
            parkingLotService.addFreeSpots(in.nextInt(),in.nextInt());
        }
    }
}
