package org.example.template;

public abstract class ReportGenerator {
    // TEMPLATE method - final method so that subclass can not change the order
    public final void generate(){
        fetchData();
        formatData();
        exportPdf();
    }

    // steps that subclass can override
    protected abstract void fetchData();
    protected abstract void formatData();

    // common step
    protected void exportPdf(){
        System.out.println("Exporting PDF ...");
    }
}
