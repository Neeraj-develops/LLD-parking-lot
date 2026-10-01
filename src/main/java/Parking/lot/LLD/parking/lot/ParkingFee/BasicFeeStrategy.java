package Parking.lot.LLD.parking.lot.ParkingFee;

import Parking.lot.LLD.parking.lot.Enums.DurationType;


public class BasicFeeStrategy implements ParkingFeeStrategy{

    @Override
    public double calculateFee(String vehicle_Type, int duration, DurationType durationType) {
        return switch (vehicle_Type.toLowerCase()) {
            case "bike" -> durationType == DurationType.HOURLY ? duration * 5.0 : duration * 5.0 * 24;
            case "car" -> durationType == DurationType.HOURLY ? duration * 10.0 : duration * 10.0 * 24;
            case "auto" -> durationType == DurationType.HOURLY ? duration * 8.0 : duration * 8.0 * 24;
            default -> durationType == DurationType.HOURLY
                    ? duration * 15.0   // $15 per hour for other vehicles
                    : duration * 15.0 * 24;
        };
    }
}
