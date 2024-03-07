package repository;

import exception.TicketNotFoundException;
import exception.parkingLotNotFoundException;
import models.ParkingLot;
import models.ParkingLot;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingLotRepository {

    private Map<Integer, ParkingLot> parkingLotMap;

    public ParkingLotRepository() {
        this.parkingLotMap = new HashMap<>();
    }

    public ParkingLot get(int parkingLotId){
        ParkingLot parkingLot = parkingLotMap.get(parkingLotId);
        if(parkingLot == null){
            throw new parkingLotNotFoundException("ParkingLot not found for id: "+parkingLotId);
        }
        return parkingLot;
    }

    public void put(ParkingLot parkingLot){
        parkingLotMap.put(parkingLot.getId(), parkingLot);
    }
}

