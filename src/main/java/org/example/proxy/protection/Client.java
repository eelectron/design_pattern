package org.example.proxy.protection;

public class Client {

    static void main() {
        FileOperationsProxy fileOperationsProxy = new FileOperationsProxy("USER");
        fileOperationsProxy.read();
        fileOperationsProxy.write();
        fileOperationsProxy.delete();

        FileOperationsProxy adminOps = new FileOperationsProxy("ADMIN");
        adminOps.delete();
    }
}
