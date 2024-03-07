package exception;

public class ParkingSpotNotFoundForVehicle extends RuntimeException{
    public ParkingSpotNotFoundForVehicle() {
    }

    public ParkingSpotNotFoundForVehicle(String message) {
        super(message);
    }
}
