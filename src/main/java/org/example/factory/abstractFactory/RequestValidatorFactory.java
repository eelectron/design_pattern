package org.example.factory.abstractFactory;

public interface RequestValidatorFactory {
    Request createRequest();
    Validator createValidator();
}
