package org.example.null_object;

public class NullUser implements User{
    @Override
    public void printName() {
        System.out.println("No User Available");
    }
}
