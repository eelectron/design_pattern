package org.example.visitor;

public class Client {
    static void main() {
        Vehicle[] vehicles = {new Car(), new Bike()};
        VehicleVisitor taxVisitor = new TaxVisitor();
        VehicleVisitor printVisitor = new PrintVisitor();

        for (Vehicle vehicle : vehicles) {
            vehicle.accept(taxVisitor);
            vehicle.accept(printVisitor);
        }
    }
}
