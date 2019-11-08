package com;

//  Создайте класс с именем Student, содержащий поля: фамилия и инициалы,
//  номер группы, успеваемость (массив из пяти элементов).
//  Создайте массив из десяти элементов такого типа.
//  Добавьте возможность вывода фамилий и номеров групп студентов,
//  имеющих оценки, равные только 9 или 10.

import java.util.Arrays;

public class Student {
    private String FIO;
    private int num;
    private int[] progress;

    public Student(String FIO, int num, int[] progress) {
        this.FIO = FIO;
        this.num = num;
        this.progress = progress;
    }

    public String getFIO() {
        return FIO;
    }

    public int getNum() {
        return num;
    }

    public int[] getProgress() {
        return progress;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setProgress(int[] progress) {
        this.progress = progress;
    }

    public boolean isExcellentStudent() {
        int tmp = 0;
        for (int i : progress) {
            if (i >= 9)
                ++tmp;
        }
        return tmp == 5;
    }

    @Override
    public String toString() {
        return "FIO = " + FIO +
                ", num = " + num +
                ", progress = " + Arrays.toString(progress);
    }
}
