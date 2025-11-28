package org.example.facade;

public class PaymentService {
    public void pay(double amount, String card){
        System.out.println("Paying amount " + amount + " using card " + card);
    }
}
