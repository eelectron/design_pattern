package org.example.factory;

public class Client {
    static void main() {
        ReportFactory pdfReportFactory = new PDFReportFactory();
        ReportService reportService = new ReportService(pdfReportFactory);
        reportService.generate();
    }
}
