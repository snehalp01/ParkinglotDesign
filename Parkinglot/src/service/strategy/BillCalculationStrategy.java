package service.strategy;

import models.Bill;
import models.Ticket;

public interface BillCalculationStrategy {
    Bill ganerateBill(Ticket ticket);
}
