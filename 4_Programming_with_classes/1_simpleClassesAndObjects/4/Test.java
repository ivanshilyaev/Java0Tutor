package com;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Test {
    public static Train[] trains = new Train[5];

    public static void fillInArray() {
        trains[0] = new Train("Minsk", 717, "10:00");
        trains[1] = new Train("Gomel", 10, "13:00");
        trains[2] = new Train("Berlin", 9000, "01:14");
        trains[3] = new Train("London", 203, "22:01");
        trains[4] = new Train("Paris", 678, "00:00");
    }

    public static void printAllTrains() {
        for (Train train : trains)
            System.out.println(train.toString());
    }

    public static Train getTrainByNumber(int num) {
        Train res = null;
        for (Train train : trains) {
            if (train.getNum() == num)
                res = train;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        fillInArray();
        Arrays.sort(trains, Comparator.comparing(Train::getNum));
        System.out.println("Trains sorted by number:");
        printAllTrains();
        System.out.println("Enter the number of the train:");
        int num = sc.nextInt();
        Train t = getTrainByNumber(num);
        if (t != null)
            System.out.println("Train with such number: " + t.toString());
        else
            System.out.println("No train with such number!");
        Arrays.sort(trains);
        System.out.println("Trains sorted by destination:");
        printAllTrains();
    }
}
