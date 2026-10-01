package Parking.lot.LLD.parking.lot;

import Parking.lot.LLD.parking.lot.Enums.DurationType;
import Parking.lot.LLD.parking.lot.ParkingFee.BasicFeeStrategy;
import Parking.lot.LLD.parking.lot.ParkingFee.ParkingFeeStrategy;
import Parking.lot.LLD.parking.lot.ParkingFee.PremiumFeeStrategy;
import Parking.lot.LLD.parking.lot.ParkingLot.ParkingLot;
import Parking.lot.LLD.parking.lot.ParkingSlot.BikeParkingSpot;
import Parking.lot.LLD.parking.lot.ParkingSlot.CarParkingSpot;
import Parking.lot.LLD.parking.lot.ParkingSlot.ParkingSpot;
import Parking.lot.LLD.parking.lot.Payment.CashPayment;
import Parking.lot.LLD.parking.lot.Payment.PaymentProcessor;
import Parking.lot.LLD.parking.lot.Payment.PaymentStrategy;
import Parking.lot.LLD.parking.lot.Vehicles.Vehicle;
import Parking.lot.LLD.parking.lot.Vehicles.VehicleFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootApplication
public class LldParkingLotApplication {

	public static final Map<String, ParkingFeeStrategy> feeMap = new HashMap<String, ParkingFeeStrategy>(){
		{
			put("basic",new BasicFeeStrategy());
			put("premium", new PremiumFeeStrategy());
		}
	};

	public static void main(String[] args) {
		SpringApplication.run(LldParkingLotApplication.class, args);

		List<ParkingSpot> spots = new ArrayList<>();
		spots.add(new BikeParkingSpot(1, "bike"));
		spots.add(new BikeParkingSpot(2, "bike"));
		spots.add(new CarParkingSpot(3, "car"));
		spots.add(new CarParkingSpot(4, "car"));

		ParkingLot parkingLot = new ParkingLot(spots);

		Vehicle vehicle = VehicleFactory.createVehicle("Bike", "12234", feeMap.get("basic"));

		ParkingSpot park = parkingLot.parkVehicle(vehicle);

		Double parkingPrice  = vehicle.calcualteFee(3, DurationType.DAYS);

		System.out.println("Amount to be paid : " + parkingPrice);

		PaymentStrategy strategy = new CashPayment();

		PaymentProcessor paymentProcessor = new PaymentProcessor(parkingPrice, strategy);

		paymentProcessor.processPayment();

		parkingLot.vacatSpot(park, vehicle);







	}

}
