package org.example.factory.abstractFactory;

public class PaymentValidator implements Validator{

    @Override
    public boolean validate(Request request) {
        return request instanceof PaymentRequest;
    }
}
