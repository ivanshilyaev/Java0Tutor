package com;

/* Создайте класс Train, содержащий поля: название пункта назначения, номер поезда,
 время отправления. Создайте данные в массив из пяти элементов типа Train, добавьте
 возможность сортировки элементов массива по номерам поездов. Добавьте возможность
 вывода информации о поезде, номер которого введен пользователем. Добавьте возможность
 сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами назначения
 должны быть упорядочены по времени отправления. */

public class Train implements Comparable<Train> {
    private String destination;
    private int num;
    private String time;

    public Train(String destination, int num, String time) {
        this.destination = destination;
        this.num = num;
        this.time = time;
    }

    public String getDestination() {
        return destination;
    }

    public int getNum() {
        return num;
    }

    public String getTime() {
        return time;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public int compareTo(Train o) {
        if (destination.equals(o.destination))
            return time.compareTo(o.time);
        else
            return destination.compareTo(o.destination);
    }

    @Override
    public String toString() {
        return "Destination = " + destination+
                ", num = " + num +
                ", time = " + time;
    }
}
