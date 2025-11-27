package org.example.strategy;

public class UPIPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paying through UPI : " + amount);
    }
}
