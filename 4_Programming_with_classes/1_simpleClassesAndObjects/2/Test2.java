package com;

public class Test2 {
    private double number;
    private String line;

    public Test2() {
        number = 0.0;
        line = "Hello, World!";
    }

    public Test2(double number, String line) {
        this.number = number;
        this.line = line;
    }

    public double getNumber() {
        return number;
    }

    public String getLine() {
        return line;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public void setLine(String line) {
        this.line = line;
    }
}
