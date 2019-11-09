package com;

import java.util.Scanner;

public class Test {
    public static int minBorder;
    public static int maxBorder;
    public static int state;

    public static boolean checkData(int minBorder, int maxBorder) {
        if (minBorder >= maxBorder) {
            System.out.println("Incorrect data: " +
                    "min border should be less than max border!");
            return false;
        }
        return true;
    }

    public static boolean checkData(int minBorder, int maxBorder, int state) {
        if (state < minBorder || state > maxBorder) {
            System.out.println("Incorrect data: " +
                    "state should be between min and max border!");
            return false;
        }
        return true;
    }

    public static void getData(Scanner sc) {
        System.out.println("Enter min and max border:");
        minBorder = sc.nextInt();
        maxBorder = sc.nextInt();
        while (!checkData(minBorder, maxBorder)) {
            System.out.println("Try again!");
            minBorder = sc.nextInt();
            maxBorder = sc.nextInt();
        }
        System.out.println("Would you like to enter state? y / n");
        String s = sc.next();
        if (s.equals("y")) {
            System.out.println("Enter state:");
            state = sc.nextInt();
            while (!checkData(minBorder, maxBorder, state)) {
                System.out.println("Try again!");
                state = sc.nextInt();
            }
        }
        else
            state = minBorder - 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        getData(sc);
        DecimalCounter counter;
        counter = (state < minBorder) ? new DecimalCounter(minBorder, maxBorder)
            : new DecimalCounter(minBorder, maxBorder, state);
        System.out.println(counter.getState());
        counter.incState();
        System.out.println(counter.getState());
        counter.decState();
        System.out.println(counter.getState());
    }
}
