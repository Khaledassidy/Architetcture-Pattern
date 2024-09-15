package com.example.architecturepattern.MVI;

public class Error extends Viewstate {
    private final String error;

    public Error(String error) {
        this.error = error;
    }

    public String getError() {
        return error;
    }
}
