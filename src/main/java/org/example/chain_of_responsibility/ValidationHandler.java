package org.example.chain_of_responsibility;

public class ValidationHandler extends Handler{
    @Override
    public void handle(Request request) {
        System.out.println("Validating request ...");

        if(request.getData() == null){
            throw new RuntimeException("Invalid data");
        }

        if(nextHandler != null){
            nextHandler.handle(request);
        }
    }
}
