package Parking.lot.LLD.parking.lot.Vehicles;

import Parking.lot.LLD.parking.lot.ParkingFee.ParkingFeeStrategy;

public class OtherVehicle extends Vehicle {
    public OtherVehicle(String licensePlate, String vehicleType, ParkingFeeStrategy feeStrategy) {
        super(licensePlate, vehicleType, feeStrategy);
    }
}
