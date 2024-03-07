package service.strategy;

import models.ParkingLot;
import models.ParkingSpot;
import models.Vehicle;

public interface SpotAllocationStrategy {

    ParkingSpot getSpotForVehicle(ParkingLot parkingLot, Vehicle vehicle);
}
