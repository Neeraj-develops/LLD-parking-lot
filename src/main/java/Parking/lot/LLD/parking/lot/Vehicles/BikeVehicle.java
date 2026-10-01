package Parking.lot.LLD.parking.lot.Vehicles;

import Parking.lot.LLD.parking.lot.ParkingFee.ParkingFeeStrategy;

public class BikeVehicle extends Vehicle{
    public BikeVehicle(String licencePlate, String vehicleType, ParkingFeeStrategy parkingFeeStrategy){
        super(licencePlate,vehicleType,parkingFeeStrategy);
    }
}
