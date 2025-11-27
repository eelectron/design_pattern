package org.example.factory;

public class ExcelReportFactory extends ReportFactory{
    @Override
    Report createReport() {
        return new ExcelReport();
    }
}
