package com;

public class Test {
    public static void main(String[] args) {
        Time time = new Time(17, 18, 270);
        System.out.println(time.toString());
        time.setTime(23, 59, 800);
        System.out.println(time.toString());
        time.add3minutes();
        time.add3hours();
        System.out.println(time.toString());
    }
}
