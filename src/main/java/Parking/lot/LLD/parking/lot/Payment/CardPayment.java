package Parking.lot.LLD.parking.lot.Payment;

public class CardPayment implements PaymentStrategy{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Card Payment");
        System.out.println("Card Payment done");
    }
}
