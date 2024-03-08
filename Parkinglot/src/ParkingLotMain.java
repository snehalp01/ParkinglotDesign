import controller.InitializationController;
import models.ParkingLot;
import models.Vehicle;
import models.enums.VehicleType;
import repository.GateRepository;
import repository.ParkingFloorRepository;
import repository.ParkingLotRepository;
import repository.ParkingSpotRepository;
import service.InitialisationService;

import java.util.Scanner;

public class ParkingLotMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        ParkingFloorRepository parkingFloorRepository = new ParkingFloorRepository();
        ParkingSpotRepository parkingSpotRepository = new ParkingSpotRepository();
        GateRepository gateRepository = new GateRepository();
        InitialisationService initialisationService = new InitialisationService(
                            parkingLotRepository,
                            parkingFloorRepository,
                            parkingSpotRepository,
                            gateRepository);
        InitializationController initController = new InitializationController(initialisationService);
        System.out.println("*** ParkingLot Initialization - Start ***");
        ParkingLot parkingLot = initController.init();
        System.out.println(parkingLot);
        System.out.println("*** ParkingLot Initialization - Complete ***");
        while(true) {
            System.out.println("Options 1. Enter Parkinglot 2. Exit Parkinglot 3. Exit");
            int n = sc.nextInt();
            if(n==1){
//                Ticket generation flow
                Vehicle vehicle = new Vehicle();
                System.out.println("WELCOME");
                System.out.println("Enter vehicle number");
                String vehicle_number = sc.nextLine();
                vehicle.setVehicleNumber(vehicle_number);
                System.out.println("Enter vehicle type : 1. Four wheeler 2. Two Wheeler");
                int type = sc.nextInt();
                if(n==1){
                    vehicle.setVehicleType(VehicleType.FOUR_WHEELER);
                } else if (n==2) {
                    vehicle.setVehicleType(VehicleType.TWO_WHEELER);
                }
            }
            else if(n==2){
//                Payment generation flow
            }
            else{
                System.out.println("THANKS");
                break;
            }
        }
        System.out.println("END");
    }
}
