package org.example.factory.abstractFactory;

public class PaymentRequest implements Request{

    @Override
    public void process() {
        System.out.println("Processing payment request");
    }
}
