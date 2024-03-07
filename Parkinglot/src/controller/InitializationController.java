package controller;

import models.ParkingLot;
import service.InitialisationService;

public class InitializationController {

    private InitialisationService initialisationService;

    public InitializationController(InitialisationService initialisationService) {
        this.initialisationService = initialisationService;
    }

    public ParkingLot init(){
        return initialisationService.init();
    }


}
