package Parking.lot.LLD.parking.lot.ParkingSlot;

import Parking.lot.LLD.parking.lot.Vehicles.Vehicle;

public class CarParkingSpot extends ParkingSpot{

    public CarParkingSpot(int spotNumber, String spotType){
        super(spotNumber,spotType);
    }

    @Override
    public boolean canPark(Vehicle vehicle) {
        return "Car".equalsIgnoreCase(vehicle.getVehicleTypetype());
    }
}
