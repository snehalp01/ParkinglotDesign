package repository;

import exception.TicketNotFoundException;
import models.Ticket;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TicketRepository {

    private Map<Integer, Ticket> tickets;

    public TicketRepository() {
        this.tickets = new HashMap<>();
    }

    public Ticket get(int ticketId){
        Ticket ticket = tickets.get(ticketId);
        if(ticket == null){
            throw new TicketNotFoundException("Ticket not found for id: "+ticketId);
        }
        return ticket;
    }

    public Ticket put(Ticket ticket){

        tickets.put(ticket.getId(), ticket);
        return ticket;
    }
}
