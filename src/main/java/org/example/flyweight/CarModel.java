package org.example.flyweight;

public class CarModel {
    private String brand;
    private String engine;
    private String color;

    public CarModel(String brand, String engine, String color) {
        this.brand = brand;
        this.engine = engine;
        this.color = color;
    }

    public void show(String number, String owner){
        System.out.println(brand + " | " + engine + " | " + color + " | " + number + " | " + owner);
    }
}
