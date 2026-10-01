package Parking.lot.LLD.parking.lot.Vehicles;

import Parking.lot.LLD.parking.lot.ParkingFee.ParkingFeeStrategy;

public class VehicleFactory {
    public static Vehicle createVehicle(String vehicleType, String licencePlate, ParkingFeeStrategy parkingFeeStrategy){
        if(vehicleType.equalsIgnoreCase("CAR")){
            return new CarVehicle(licencePlate,vehicleType,parkingFeeStrategy);
        }else if (vehicleType.equalsIgnoreCase("BIKE")){
            return  new BikeVehicle(licencePlate,vehicleType,parkingFeeStrategy);
        }
        return  new OtherVehicle(licencePlate,vehicleType,parkingFeeStrategy);
    }
}
