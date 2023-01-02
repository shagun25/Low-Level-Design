package LowLevelDesign.ParkingLot.service;

import LowLevelDesign.ParkingLot.model.parking.ParkingSpot;
import LowLevelDesign.ParkingLot.model.person.Person;
import LowLevelDesign.ParkingLot.model.ticket.Ticket;
import LowLevelDesign.ParkingLot.model.ticket.TicketStatus;
import LowLevelDesign.ParkingLot.model.vehicle.Vehicle;

import java.util.Date;
import java.util.HashMap;
import java.util.Random;

public class TicketService {

    HashMap<Person, Ticket> ticketsCollection = new HashMap<>();

    public Ticket getTicket(int parkingEntryGateNumber, ParkingSpot parkingSpot, Vehicle vehicle) {
        Ticket ticket = new Ticket(new Random().nextInt(), vehicle, parkingEntryGateNumber, parkingSpot, TicketStatus.BOOKED);
        ticketsCollection.put(vehicle.getOwner(), ticket);
        return ticket;
    }

    public double getParkingFare(Ticket ticket) {
        long now = new Date().getTime();
        int farePrice = ticket.getVehicle().getVehicleCategory().getFarePrice();
        ticketsCollection.remove(ticket.getVehicle().getOwner());
        return now*farePrice;
    }

    public HashMap<Person, Ticket> getTicketsCollection(){
        return ticketsCollection;
    }
}
