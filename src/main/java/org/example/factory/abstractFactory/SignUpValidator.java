package org.example.factory.abstractFactory;

public class SignUpValidator implements Validator{
    @Override
    public boolean validate(Request request) {
        return request instanceof SignUpRequest;
    }
}
