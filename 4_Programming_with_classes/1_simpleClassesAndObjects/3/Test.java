package com;

public class Test {
    public static Student[] array = new Student[10];

    public static int[] getRandomMarks() {
        int[] result = new int[5];
        for (int i=0; i<5; ++i)
            result[i] = (int)(8 + Math.random() * 3);
        return result;
    }

    public static void printAllStudents() {
        for (Student student : array)
            System.out.println(student.toString());
    }

    public static void printAllExcellentStudents() {
        int tmp = 0;
        for (Student student : array) {
            if (student.isExcellentStudent()) {
                System.out.println(student.getFIO() + ", " + student.getNum());
                ++tmp;
            }
        }
        if (tmp == 0)
            System.out.println("No such students!");
    }

    public static void main(String[] args) {
        for (int i=0; i<10; ++i) {
            array[i] = new Student("Student"+i, 9, getRandomMarks());
        }
        printAllStudents();
        System.out.println("Excellent students:");
        printAllExcellentStudents();
    }
}
