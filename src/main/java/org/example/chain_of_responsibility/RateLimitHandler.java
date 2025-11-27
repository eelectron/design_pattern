package org.example.chain_of_responsibility;

public class RateLimitHandler extends Handler{
    @Override
    public void handle(Request request) {
        System.out.println("Checking rate limit ...");

        if(request.getCount() > 10){
            throw new RuntimeException("Too many requests");
        }

        if(nextHandler != null){
            nextHandler.handle(request);
        }
    }
}
