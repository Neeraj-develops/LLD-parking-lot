package Parking.lot.LLD.parking.lot.ParkingLot;

import Parking.lot.LLD.parking.lot.ParkingSlot.ParkingSpot;
import Parking.lot.LLD.parking.lot.Vehicles.Vehicle;
import lombok.Getter;

import java.util.List;

public class ParkingLot {
    @Getter
    private List<ParkingSpot> spots;

    public ParkingLot(List<ParkingSpot> spots){
        this.spots = spots;
    }

    public ParkingSpot findSpot(String vehicleType){
        for(ParkingSpot spot : spots){
            if(spot.getSpotType().equalsIgnoreCase(vehicleType) && !spot.isOccupied()){
                return  spot;
            }
        }
        return null;
    }

    public ParkingSpot parkVehicle(Vehicle vehicle){
        ParkingSpot spot = findSpot(vehicle.getVehicleTypetype());
        if(spot != null){
            spot.parkVehicle(vehicle);
            System.out.println("Vehicle is being parked successfully at spot: " + spot.getSpotNumber());
            return  spot;
        }
        System.out.println("Spot us not available for vehicle type: " + vehicle.getVehicleTypetype());
        return  null;
    }

    public void vacatSpot(ParkingSpot spot, Vehicle vehicle){
        if(spot != null && spot.isOccupied() && spot.getVehicle().equals(vehicle)){
            spot.vacat();
            System.out.println("Spot has been successfully vacated");
        }else {
            System.out.println("Invalid operation, either the spot is already vacant or the vehicle is not for the correct spot");
        }
    }
    public ParkingSpot getSpotbyNumber(ParkingSpot spot){
        for (ParkingSpot s : spots){
            if(s.getSpotNumber() == spot.getSpotNumber()){
                return s;
            }
        }
        return null;
    }

}
