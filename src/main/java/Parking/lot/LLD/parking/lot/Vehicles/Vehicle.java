package Parking.lot.LLD.parking.lot.Vehicles;

import Parking.lot.LLD.parking.lot.Enums.DurationType;
import Parking.lot.LLD.parking.lot.ParkingFee.ParkingFeeStrategy;
import lombok.Getter;

public abstract class Vehicle {
    @Getter
    private String lincencePlate;
    @Getter
    private String vehicleTypetype;
    private ParkingFeeStrategy feeStrategy;

    public Vehicle(String lincencePlate, String vehicleType, ParkingFeeStrategy feeStrategy){
        this.feeStrategy = feeStrategy;
        this.vehicleTypetype = vehicleType;
        this.lincencePlate= lincencePlate;
    }
    public double calcualteFee( int duration, DurationType durationType){
        return feeStrategy.calculateFee(vehicleTypetype,duration,durationType);
    }

}
