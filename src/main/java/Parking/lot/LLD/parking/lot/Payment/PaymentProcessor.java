package Parking.lot.LLD.parking.lot.Payment;

import lombok.Setter;

public class PaymentProcessor {

    private Double amount;
    @Setter
    private  PaymentStrategy paymentStrategy;

    public PaymentProcessor(Double amount, PaymentStrategy paymentStrategy){
        this.amount = amount;
        this.paymentStrategy=paymentStrategy;
    }



    public void processPayment(){
        if(amount >0 ){
            this.paymentStrategy.processPayment(amount);
        }else {
            System.out.println("Invalid payment amount");
        }
    }
}
