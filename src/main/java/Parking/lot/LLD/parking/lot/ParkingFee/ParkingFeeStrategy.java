package Parking.lot.LLD.parking.lot.ParkingFee;

import Parking.lot.LLD.parking.lot.Enums.DurationType;

public interface ParkingFeeStrategy {
    double calculateFee(String VehicleType, int duration, DurationType durationType);
}
