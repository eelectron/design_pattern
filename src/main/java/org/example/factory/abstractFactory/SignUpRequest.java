package org.example.factory.abstractFactory;

public class SignUpRequest implements Request{

    @Override
    public void process() {
        System.out.println("Processing sign up request");
    }
}
