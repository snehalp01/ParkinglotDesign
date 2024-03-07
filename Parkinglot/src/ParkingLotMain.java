import controller.InitializationController;
import models.ParkingLot;
import repository.GateRepository;
import repository.ParkingFloorRepository;
import repository.ParkingLotRepository;
import repository.ParkingSpotRepository;
import service.InitialisationService;

public class ParkingLotMain {

    public static void main(String[] args) {

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
        ParkingLot parkingLot = initController.init();
        System.out.println(parkingLot);
        System.out.println("END");
    }
}
