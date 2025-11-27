package org.example.factory;

public class PDFReport implements Report{
    @Override
    public void create() {
        System.out.println("PDF Report created .");
    }
}
