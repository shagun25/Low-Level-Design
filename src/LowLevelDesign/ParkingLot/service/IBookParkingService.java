package LowLevelDesign.ParkingLot.service;

import LowLevelDesign.ParkingLot.model.gate.ParkingEntryGate;
import LowLevelDesign.ParkingLot.model.ticket.Ticket;
import LowLevelDesign.ParkingLot.model.vehicle.Vehicle;

public interface IBookParkingService {
    // return ticket
    Ticket bookParking(int parkingGateNumber, Vehicle vehicle);
}
