package org.example.null_object;

public class RealUser implements User{
    private String name;

    public RealUser(String name) {
        this.name = name;
    }

    @Override
    public void printName() {
        System.out.println("User Name: " + name);
    }
}
