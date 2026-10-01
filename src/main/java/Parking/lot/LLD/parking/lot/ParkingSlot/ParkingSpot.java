package Parking.lot.LLD.parking.lot.ParkingSlot;

import Parking.lot.LLD.parking.lot.Vehicles.Vehicle;
import lombok.Getter;

public abstract class ParkingSpot {
    @Getter
    private int spotNumber;
    private boolean isOccupied;
    @Getter
    private Vehicle vehicle;
    @Getter
    private String spotType;

    public boolean isOccupied(){
        return this.isOccupied;
    }

    public ParkingSpot(int spotNumber, String spotType){
        this.spotNumber = spotNumber;
        this.spotType = spotType;
        this.isOccupied = false;
    }

    public abstract boolean canPark(Vehicle vehicle);

    public void parkVehicle(Vehicle vehicle){
        if(isOccupied){
            throw  new IllegalStateException("Spot is alreay occupied");
        }
        if(!canPark(vehicle)){
            throw  new IllegalArgumentException("this spot is suitable for " + vehicle.getVehicleTypetype());
        }
        this.vehicle = vehicle;
        this.isOccupied = true;
    }

    public void vacat(){
        if(!isOccupied){
            throw new IllegalStateException("Spot is already vacant.");
        }
        this.vehicle = null;
        this.isOccupied = false;
    }
}
