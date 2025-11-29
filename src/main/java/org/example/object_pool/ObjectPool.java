package org.example.object_pool;

import java.util.List;

public class ObjectPool {
    private List<ExpensiveObject> availableObjects;
    private List<ExpensiveObject> inUseObjects;
    private final int MAX_POOL_SIZE;

    public ObjectPool(int maxPoolSize) {
        this.MAX_POOL_SIZE = maxPoolSize;
        this.availableObjects = new java.util.ArrayList<>();
        this.inUseObjects = new java.util.ArrayList<>();
    }

    public synchronized ExpensiveObject acquireObject() {
        if (!availableObjects.isEmpty()) {
            ExpensiveObject obj = availableObjects.removeLast();
            inUseObjects.add(obj);
            return obj;
        } else if (inUseObjects.size() < MAX_POOL_SIZE) {
            ExpensiveObject newObj = new ExpensiveObject();
            inUseObjects.add(newObj);
            return newObj;
        } else {
            throw new RuntimeException("No available objects in the pool");
        }
    }

    public synchronized void releaseObject(ExpensiveObject obj) {
        inUseObjects.remove(obj);
        availableObjects.add(obj);
    }
}
