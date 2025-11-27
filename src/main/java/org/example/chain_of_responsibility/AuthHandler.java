package org.example.chain_of_responsibility;

public class AuthHandler extends Handler{
    @Override
    public void handle(Request request) {
        System.out.println("Authenticating request ...");

        if(!request.isAuthenticated()){
            throw new RuntimeException("Auth failed");
        }

        if(nextHandler != null){
            nextHandler.handle(request);
        }
    }
}
