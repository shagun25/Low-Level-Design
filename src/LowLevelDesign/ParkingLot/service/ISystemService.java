package LowLevelDesign.ParkingLot.service;

import LowLevelDesign.ParkingLot.model.parking.ParkingFloor;
import LowLevelDesign.ParkingLot.model.parking.ParkingSpace;

public interface ISystemService {
    ParkingFloor addParkingFloor(ParkingFloor parkingFloor);

    ParkingSpace removeParkingFloor(int floorNumber);

    ParkingFloor addEntranceGate(int floorNumber, int gateNumber);

    ParkingFloor addExitGate(int floorNumber, int gateNumber);

    ParkingFloor removeEntranceGate(int floorNumber, int gateNumber);

    ParkingFloor removeExitGate(int floorNumber, int gateNumber);

    ParkingFloor getParkingInformation(int floorNumber);
}
