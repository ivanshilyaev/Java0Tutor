package com;

public class Test {
    public static void main(String[] args) {
        Test1 test1 = new Test1(8, 10);
        test1.writeFields();
        System.out.println("Sum is " + test1.sum());
        System.out.println("Max is " + test1.max());
    }
}
