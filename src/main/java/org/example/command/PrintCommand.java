package org.example.command;

public class PrintCommand implements Command{
    private Document document;

    public PrintCommand(Document document) {
        this.document = document;
    }

    @Override
    public void execute() {
        System.out.println("Executing print document command ...");
        document.print();
    }
}
