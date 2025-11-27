package org.example.adapter;

public class Client {
    public String getReport(Report report, String data){
        return report.getJsonData(data);
    }
}
