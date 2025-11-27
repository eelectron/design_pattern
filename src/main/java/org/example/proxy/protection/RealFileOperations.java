package org.example.proxy.protection;

public class RealFileOperations implements FileOperations{

    @Override
    public void read() {
        System.out.println("Reading file ...");
    }

    @Override
    public void write() {
        System.out.println("Writing file ...");
    }

    @Override
    public void delete() {
        System.out.println("Deleting file ...");
    }
}
