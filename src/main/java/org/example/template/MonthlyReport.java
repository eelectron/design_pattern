package org.example.template;

public class MonthlyReport extends ReportGenerator{
    @Override
    protected void fetchData() {
        System.out.println("Fetching monthly report");
    }

    @Override
    protected void formatData() {
        System.out.println("Formating monthly report");
    }
}
