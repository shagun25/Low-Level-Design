package LowLevelDesign.ParkingLot.service;

import LowLevelDesign.ParkingLot.model.ticket.Ticket;

public interface IFreeParkingService{
    // returns cost
    public double freeParking(Ticket ticket);
}
