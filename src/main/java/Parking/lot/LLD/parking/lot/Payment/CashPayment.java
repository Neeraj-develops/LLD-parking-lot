package Parking.lot.LLD.parking.lot.Payment;

public class CashPayment implements PaymentStrategy{
    public CashPayment(){};
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Cash Payment");
        System.out.println("Cash Payment done");
    }
}
