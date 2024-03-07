package service;

import models.Gate;
import models.ParkingFloor;
import models.ParkingLot;
import models.ParkingSpot;
import models.enums.*;
import repository.GateRepository;
import repository.ParkingFloorRepository;
import repository.ParkingLotRepository;
import repository.ParkingSpotRepository;

import java.util.ArrayList;
import java.util.List;

public class InitialisationService {
    private ParkingLotRepository parkingLotRepository;
    private ParkingFloorRepository parkingFloorRepository;
    private ParkingSpotRepository parkingSpotRepository;
    private GateRepository gateRepository;

    public InitialisationService(ParkingLotRepository parkingLotRepository, ParkingFloorRepository parkingFloorRepository, ParkingSpotRepository parkingSpotRepository, GateRepository gateRepository) {
        this.parkingLotRepository = parkingLotRepository;
        this.parkingFloorRepository = parkingFloorRepository;
        this.parkingSpotRepository = parkingSpotRepository;
        this.gateRepository = gateRepository;
    }

    public ParkingLot init(){
        System.out.println("Starting Initialization service");
//        parkingLot
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.setAddress("Somewhere in Banglore");
        parkingLot.setName("Uber Mall");
        parkingLot.setParkingLotStatus(ParkingLotStatus.AVAILABLE);
        parkingLot.setCapacity(100);
        parkingLotRepository.put(parkingLot);
        List<ParkingFloor> parkingFloorList = new ArrayList<>();
        for(int i=1; i<=4; i++){
//            parking floor
            ParkingFloor parkingFloor = new ParkingFloor();
            parkingFloorRepository.put(parkingFloor);
//            parkingFloor.setId(i);
            parkingFloor.setFloorNumber(i);
//            parking floor - entry Gate
            Gate entryGate = new Gate();
//            entryGate.setId(i*100+1);
            entryGate.setGateNumber(i*100+1);
            entryGate.setGateType(GateType.ENTRY_GATE);
            entryGate.setGateStatus(GateStatus.OPEN);
            parkingFloor.setEntryGate(entryGate);
            gateRepository.put(entryGate);

//            parking floor exit gate
            Gate exitGate = new Gate();
//            exitGate.setId(i*100+2);
            exitGate.setGateNumber(i*100+2);
            exitGate.setGateType(GateType.EXIT_GATE);
            exitGate.setGateStatus(GateStatus.OPEN);
            parkingFloor.setExitGate(exitGate);
            gateRepository.put(exitGate);

            List<ParkingSpot> parkingSpotList = new ArrayList<>();
            for(int j=1; j<=25; j++){
                ParkingSpot parkingSpot = new ParkingSpot();
                parkingSpotRepository.put(parkingSpot);
//                parkingSpot.setId(j);
                parkingSpot.setParkingSpotStatus(ParkingSpotStatus.EMPTY);
                parkingSpot.setNumber(j);
                parkingSpot.setVehicleType(VehicleType.FOUR_WHEELER);
                parkingSpotList.add(parkingSpot);
            }
            parkingFloor.setParkingSpots(parkingSpotList);
            parkingFloorList.add(parkingFloor);
        }
        parkingLot.setFloors(parkingFloorList);

        return parkingLotRepository.get(0);

    }
}
