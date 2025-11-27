package org.example.chain_of_responsibility;

public class Request {
    public boolean isAuthenticated() {
        return true;
    }

    public int getCount() {
        return 4;
    }

    public String getData() {
        return "data";
    }
}
