package com;

// Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран
// и методы изменения этих переменных. Добавьте метод, который находит сумму
// значений этих переменных, и метод, который находит наибольшее значение
// из этих двух переменных.

public class Test1 {
    private int a;
    private int b;

    public Test1(int number, int line) {
        this.a = number;
        this.b = line;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void writeFields() {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public int sum() {
        return a+b;
    }

    public int max() {
        return Math.max(a, b);
    }
}
