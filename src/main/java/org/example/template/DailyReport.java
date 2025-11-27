package org.example.template;

public class DailyReport extends ReportGenerator{
    @Override
    protected void fetchData() {
        System.out.println("Fetching daily report");
    }

    @Override
    protected void formatData() {
        System.out.println("Formatting daily report");
    }
}
