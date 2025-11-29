package org.example.object_pool;

public class Client {
    static void main() {
        ObjectPool pool = new ObjectPool(2);
        ExpensiveObject obj1 = pool.acquireObject();
        obj1.performOperation();

        ExpensiveObject obj2 = pool.acquireObject();
        obj2.performOperation();
        pool.releaseObject(obj2);

        System.out.println("Obj1 == Obj2 " + (obj1 == obj2));

        pool.releaseObject(obj2);

        ExpensiveObject obj3 = pool.acquireObject();
        obj3.performOperation();
        System.out.println("Obj1 == Obj3 " + (obj1 == obj3));
    }
}
