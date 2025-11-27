package org.example.factory.abstractFactory;

public class SignUpFactory implements RequestValidatorFactory{
    @Override
    public Request createRequest() {
        return new SignUpRequest();
    }

    @Override
    public Validator createValidator() {
        return new SignUpValidator();
    }
}
