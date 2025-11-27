package org.example.chain_of_responsibility;

public class Client {
    static void main() {
        Handler chain = new AuthHandler();
        chain.setNextHandler(new RateLimitHandler()).setNextHandler(new ValidationHandler());

        Request request = new Request();
        chain.handle(request);
    }
}
