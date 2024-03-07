package repository;

import exception.GateNotFoundException;
import exception.ParkingFloorNotFoundException;
import models.Gate;
import models.ParkingSpot;

import java.util.HashMap;
import java.util.Map;

public class GateRepository {
    private Map<Integer, Gate> gateMap;

    public GateRepository() {
        this.gateMap = new HashMap<>();
    }

    public Gate get(int gateId){
        Gate gate  = gateMap.get(gateId);
        if(gate == null){
            throw new GateNotFoundException("Parking Spot not found for id: "+gateId);
        }
        return gate;
    }

    public void put(Gate gate){
        gateMap.put(gate.getId(), gate);
    }
}