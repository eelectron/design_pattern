package org.example.prototype;

public class PageSettings implements Cloneable{
    private double start;
    private double end;

    public PageSettings(double start, double end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public PageSettings clone() {
        try {
            PageSettings clone = (PageSettings) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            clone.start = start;
            clone.end = end;
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "PageSettings{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }
}
