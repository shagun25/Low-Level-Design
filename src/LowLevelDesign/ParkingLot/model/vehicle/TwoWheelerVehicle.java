package LowLevelDesign.ParkingLot.model.vehicle;

import LowLevelDesign.ParkingLot.model.person.VehicleOwner;

public class TwoWheelerVehicle extends Vehicle{

    public TwoWheelerVehicle(VehicleOwner vehicleOwner, String vehicleNumber) {
        super(vehicleOwner, vehicleNumber, VehicleCategoryWithCost.TWOWHEELER);
    }

}
