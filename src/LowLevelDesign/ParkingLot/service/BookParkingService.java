package LowLevelDesign.ParkingLot.service;

import LowLevelDesign.ParkingLot.model.gate.ParkingEntryGate;
import LowLevelDesign.ParkingLot.model.ticket.Ticket;
import LowLevelDesign.ParkingLot.model.vehicle.Vehicle;

public class BookParkingService implements IBookParkingService{

    ParkingService parkingService;

    public BookParkingService(ParkingService parkingService){
        this.parkingService = parkingService;
    }

    @Override
    public Ticket bookParking(int parkingEntryGateNumber, Vehicle vehicle) {
        return parkingService.bookParking(parkingEntryGateNumber, vehicle);
    }
}
