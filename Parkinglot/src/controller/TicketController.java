package controller;

import exception.InvaliRequestException;
import models.ParkingLot;
import models.Ticket;
import models.Vehicle;
import service.TicketService;

public class TicketController {
    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public Ticket generateTicket(Vehicle vehicle, int parkingLotID){
//        Need to complete the function
        if(parkingLotID<=0){
            throw  new InvaliRequestException("Incorrect parkinglot Id: "+parkingLotID);
        }
        else{
            return null
        }
    }
}
