package Parking.lot.LLD.parking.lot.ParkingSlot;

import Parking.lot.LLD.parking.lot.Vehicles.BikeVehicle;
import Parking.lot.LLD.parking.lot.Vehicles.Vehicle;

public class BikeParkingSpot extends ParkingSpot{

    public BikeParkingSpot(int spotNumber, String spotType){
        super(spotNumber, spotType);
    }

    @Override
    public boolean canPark(Vehicle vehicle) {
        return "Bike".equalsIgnoreCase(vehicle.getVehicleTypetype());
    }
}
