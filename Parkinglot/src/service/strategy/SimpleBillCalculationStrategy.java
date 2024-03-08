package service.strategy;

import models.Bill;
import models.Ticket;
import models.enums.BillStatus;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class SimpleBillCalculationStrategy implements BillCalculationStrategy{

    @Override
    public Bill ganerateBill(Ticket ticket) {
//        1 sec = 1 Rs.
        LocalDateTime entryTime = ticket.getEntryTime();
        LocalDateTime exitTime = LocalDateTime.now();
        long numberOfSeconds = ChronoUnit.SECONDS.between(exitTime, entryTime);
        long amount = numberOfSeconds +20;
        Bill bill = new Bill();
        bill.setAmount(amount);
        bill.setExitTime(exitTime);
        bill.setTicket(ticket);
        bill.setBillStatus(BillStatus.UNPAID);
        return bill;
    }
}
