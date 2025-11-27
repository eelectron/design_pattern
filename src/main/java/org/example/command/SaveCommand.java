package org.example.command;

public class SaveCommand implements Command{
    private Document document;

    public SaveCommand(Document document){
        this.document = document;
    }

    @Override
    public void execute() {
        System.out.println("executing save document command ...");
        document.save();
    }
}
