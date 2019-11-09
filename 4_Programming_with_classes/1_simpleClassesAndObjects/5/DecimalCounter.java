package com;

/* Опишите класс, реализующий десятичный счетчик, который может увеличивать или
 уменьшать свое значение на единицу в заданном диапазоне. Предусмотрите
 инициализацию счетчика значениями по умолчанию и произвольными значениями.
 Счетчик имеет методы увеличения и уменьшения состояния, и метод позволяющее
 получить его текущее состояние. Написать код, демонстрирующий все возможности класса. */

public class DecimalCounter {
    private int minBorder;
    private int maxBorder;
    private int state;

    public DecimalCounter(int minBorder, int maxBorder) {
        this.minBorder = minBorder;
        this.maxBorder = maxBorder;
        state = (maxBorder - minBorder) / 2; // default value
    }

    public DecimalCounter(int minBorder, int maxBorder, int state) {
        this.minBorder = minBorder;
        this.maxBorder = maxBorder;
        this.state = state;
    }

    public int getMinBorder() {
        return minBorder;
    }

    public int getMaxBorder() {
        return maxBorder;
    }

    public int getState() {
        return state;
    }

    public void incState() {
        if (state < maxBorder)
            ++state;
    }

    public void decState() {
        if (state > minBorder)
            --state;
    }
}
