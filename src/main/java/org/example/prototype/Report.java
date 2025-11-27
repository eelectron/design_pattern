package org.example.prototype;

public class Report implements Cloneable{
    private String title;
    private String author;
    private PageSettings settings;

    public Report(String title, String author, PageSettings settings) {
        this.title = title;
        this.author = author;
        this.settings = settings;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setSettings(PageSettings settings) {
        this.settings = settings;
    }

    @Override
    public Report clone() {
        try {
            Report reportCopy = (Report) super.clone();
            reportCopy.settings = settings.clone();
            return reportCopy;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "Report{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", settings=" + settings +
                '}';
    }
}
