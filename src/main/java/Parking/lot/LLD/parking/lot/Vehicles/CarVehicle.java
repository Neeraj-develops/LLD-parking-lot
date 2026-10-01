package Parking.lot.LLD.parking.lot.Vehicles;

import Parking.lot.LLD.parking.lot.ParkingFee.ParkingFeeStrategy;

public class CarVehicle extends Vehicle{
    public CarVehicle(String licencePlate, String vehicleType, ParkingFeeStrategy parkingFeeStrategy){
        super(licencePlate,vehicleType,parkingFeeStrategy);
    }
}
