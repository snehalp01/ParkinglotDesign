package service.strategy;

import exception.ParkingSpotNotFoundForVehicle;
import models.ParkingFloor;
import models.ParkingLot;
import models.ParkingSpot;
import models.Vehicle;
import models.enums.ParkingSpotStatus;

import java.util.List;

public class LinearSpotAllocationStrategy implements SpotAllocationStrategy {
    @Override
    public ParkingSpot getSpotForVehicle(ParkingLot parkingLot, Vehicle vehicle) {
        List<ParkingFloor> parkingFloors = parkingLot.getFloors();
        for(ParkingFloor parkingFloor: parkingFloors){
            List<ParkingSpot> parkingSpots = parkingFloor.getParkingSpots();
            for(ParkingSpot parkingSpot: parkingSpots){
                if(parkingSpot.getParkingSpotStatus().equals(ParkingSpotStatus.EMPTY) &&
                        parkingSpot.getVehicleType().equals(vehicle.getVehicleType())){
                    return parkingSpot;
                }
            }
        }
        throw new ParkingSpotNotFoundForVehicle("Parking spot not available for vehicle "+ vehicle.getVehicleType());
    }
}
