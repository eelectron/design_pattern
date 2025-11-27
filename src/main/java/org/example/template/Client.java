package org.example.template;

public class Client {
    static void main() {
        ReportGenerator dailyReport = new DailyReport();
        dailyReport.generate();

        ReportGenerator monthlyReport = new MonthlyReport();
        monthlyReport.generate();
    }
}
