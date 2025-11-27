package org.example.factory.abstractFactory;

public class RequestService {
    RequestValidatorFactory requestValidatorFactory;
    public RequestService(RequestValidatorFactory requestValidatorFactory){
        this.requestValidatorFactory = requestValidatorFactory;
    }

    public void handle(){
        Request request = requestValidatorFactory.createRequest();
        Validator validator = requestValidatorFactory.createValidator();

        if(validator.validate(request)){
            request.process();
        }
    }
}
