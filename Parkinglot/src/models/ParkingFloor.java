package models;

import java.util.List;

public class ParkingFloor extends BaseModel{
    private static int idCounter=0;
    private int floorNumber;
    private List<ParkingSpot> parkingSpots;
    private Gate entryGate;
    private  Gate exitGate;

    public ParkingFloor() {
        this.id = idCounter++;
    }

    public ParkingFloor(int floorNumber, List<ParkingSpot> parkingSpots, Gate entryGate, Gate exitGate) {
        this.floorNumber = floorNumber;
        this.parkingSpots = parkingSpots;
        this.entryGate = entryGate;
        this.exitGate = exitGate;
        this.id = idCounter++;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }

    public void setParkingSpots(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }

    public Gate getEntryGate() {
        return entryGate;
    }

    public void setEntryGate(Gate entryGate) {
        this.entryGate = entryGate;
    }

    public Gate getExitGate() {
        return exitGate;
    }

    public void setExitGate(Gate exitGate) {
        this.exitGate = exitGate;
    }

    @Override
    public String toString() {
        return "ParkingFloor{" +
                "floorNumber=" + floorNumber +
                ", parkingSpots=" + parkingSpots +
                ", entryGate=" + entryGate +
                ", exitGate=" + exitGate +
                ", id=" + id +
                '}';
    }
}

