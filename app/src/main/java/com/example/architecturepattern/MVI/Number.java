package com.example.architecturepattern.MVI;

public class Number extends Viewstate {
    private final int number;

    public Number(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
