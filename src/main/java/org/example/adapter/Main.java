package org.example.adapter;

public class Main {
    public static void main() {
        Client client = new Client();

        String data = "Hello XML";
        XMLDataProvider xmlDataProvider = new XMLDataProvider();

        Report report = new XMLDataProviderAdapter(xmlDataProvider);

        String jsonData = client.getReport(report, data);
        System.out.println(jsonData);
    }
}
