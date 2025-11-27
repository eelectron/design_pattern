package org.example.factory;

public class ReportService {
    private ReportFactory reportFactory = null;
    public ReportService(ReportFactory reportFactory){
        this.reportFactory = reportFactory;
    }

    void generate(){
        Report report = reportFactory.createReport();
        report.create();
    }
}
