package models;

import models.enums.ParkingLotStatus;

import java.util.List;

public class ParkingLot extends BaseModel{
    private static int idCounter = 0;
    private String Name;
    private String address;
    private int capacity;
    private List<ParkingFloor> floors;
    private ParkingLotStatus parkingLotStatus;

    public ParkingLot() {
        this.id = idCounter++;
    }

    public ParkingLot(String name, String address, int capacity, List<ParkingFloor> floors, ParkingLotStatus parkingLotStatus) {
        this.Name = name;
        this.address = address;
        this.capacity = capacity;
        this.floors = floors;
        this.parkingLotStatus = parkingLotStatus;
        this.id = idCounter++;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<ParkingFloor> getFloors() {
        return floors;
    }

    public void setFloors(List<ParkingFloor> floors) {
        this.floors = floors;
    }

    public ParkingLotStatus getParkingLotStatus() {
        return parkingLotStatus;
    }

    public void setParkingLotStatus(ParkingLotStatus parkingLotStatus) {
        this.parkingLotStatus = parkingLotStatus;
    }

    @Override
    public String toString() {
        return "ParkingLot{" +
                "Name='" + Name + '\'' +
                " \n, address='" + address + '\'' +
                " \n, capacity=" + capacity +
                " \n, floors=" + floors +
                " \n, parkingLotStatus=" + parkingLotStatus +
                " \n, id=" + id +
                '}';
    }
}
