package org.example.factory;

public class ExcelReport implements Report{
    @Override
    public void create() {
        System.out.println("Excel report created .");
    }
}
