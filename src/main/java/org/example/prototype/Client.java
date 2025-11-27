package org.example.prototype;

public class Client {
    static void main() {
        Report base = new Report("Default", "System", new PageSettings(1.0, 1.0));

        Report daily = base.clone();
        daily.setTitle("Daily Report");
        System.out.println(daily);

        Report monthly = base.clone();
        monthly.setTitle("Monthly Report");

        System.out.println(monthly);
    }
}
