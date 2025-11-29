package org.example.object_pool;

public class ExpensiveObject {
    public ExpensiveObject() {
        // Simulate an expensive object creation process
        try {
            Thread.sleep(2000); // Simulating delay
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void performOperation() {
        System.out.println("Performing operation with ExpensiveObject");
    }
}
