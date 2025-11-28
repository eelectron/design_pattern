package org.example.visitor;

public interface Vehicle {
    void accept(VehicleVisitor visitor);
}
