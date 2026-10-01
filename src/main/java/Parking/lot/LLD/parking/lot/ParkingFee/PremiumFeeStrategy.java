package Parking.lot.LLD.parking.lot.ParkingFee;

import Parking.lot.LLD.parking.lot.Enums.DurationType;

public class PremiumFeeStrategy implements ParkingFeeStrategy{
    @Override
    public double calculateFee(String vehicle_Type, int duration, DurationType durationType) {
        return switch (vehicle_Type.toLowerCase()) {
            case "car" -> durationType == DurationType.HOURLY ? duration * 15.0 : duration * 15.0 * 24;
            case "bike" -> durationType == DurationType.HOURLY ? duration * 8.0 : duration * 8.0 * 24;
            case "auto" -> durationType == DurationType.HOURLY ? duration * 12.0 : duration * 12.0 * 24;
            default -> durationType == DurationType.HOURLY
                    ? duration * 20.0   // $15 per hour for other vehicles
                    : duration * 20.0 * 24;
        };
    }
}
