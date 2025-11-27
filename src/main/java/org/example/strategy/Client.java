package org.example.strategy;

public class Client {
    static void main() {
        PaymentStrategy creditCardPayment = new CreditCardPayment();
        PaymentService paymentService = new PaymentService(creditCardPayment);
        paymentService.process(100);


        PaymentStrategy upiPayment = new UPIPayment();
        paymentService = new PaymentService(upiPayment);
        paymentService.process(1200);

    }
}
