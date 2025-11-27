package org.example.factory.abstractFactory;

public class PaymentFactory implements RequestValidatorFactory{
    @Override
    public Request createRequest() {
        return new PaymentRequest();
    }

    @Override
    public Validator createValidator() {
        return new PaymentValidator();
    }
}
