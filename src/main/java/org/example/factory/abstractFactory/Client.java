package org.example.factory.abstractFactory;

public class Client {
    static void main() {
        RequestValidatorFactory requestValidatorFactory = new SignUpFactory();
        RequestService requestService = new RequestService(requestValidatorFactory);
        requestService.handle();
    }
}
