package com;

import java.util.Scanner;

public class Test {
    public static boolean isDataCorrect(Point2D A, Point2D B, Point2D C) {
        double a = Point2D.distanceBetween2Points(B, C);
        double b = Point2D.distanceBetween2Points(A, C);
        double c = Point2D.distanceBetween2Points(A, B);
        if ((a + b <= c) || (a + c <= b) || (b + c <= a))
            return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter coordinates of 3 points: x and y");
        Point2D A = new Point2D(sc.nextDouble(), sc.nextDouble());
        Point2D B = new Point2D(sc.nextDouble(), sc.nextDouble());
        Point2D C = new Point2D(sc.nextDouble(), sc.nextDouble());
        if (!isDataCorrect(A, B, C)) {
            System.err.println("These 3 points don't form a triangle!");
        }
        else {
            Triangle triangle = new Triangle(A, B, C);
            System.out.println("Area is " + triangle.area());
            System.out.println("Perimeter is " + triangle.perimeter());
            System.out.println("Median intersection point is (" +
                    triangle.medianIntersectionPoint().getX() + "; " +
                    triangle.medianIntersectionPoint().getY() + ")");
        }
    }
}
