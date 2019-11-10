package com;

public class Triangle {
    private Point2D A;
    private Point2D B;
    private Point2D C;

    private double a;
    private double b;
    private double c;

    public Triangle(Point2D A, Point2D B, Point2D C) {
        this.A = A;
        this.B = B;
        this.C = C;
        a = Point2D.distanceBetween2Points(B, C);
        b = Point2D.distanceBetween2Points(A, C);
        c = Point2D.distanceBetween2Points(A, B);
    }

    public Point2D getA() {
        return A;
    }

    public Point2D getB() {
        return B;
    }

    public Point2D getC() {
        return C;
    }

    public double getSideA() {
        return a;
    }

    public double getSideB() {
        return b;
    }

    public double getSideC() {
        return c;
    }

    public double area() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p-a) * (p-b) * (p-c));
    }

    public double perimeter() {
        return a+b+c;
    }

    public Point2D medianIntersectionPoint() {
        return new Point2D((A.getX() + B.getX() + C.getX()) / 3,
                (A.getY() + B.getY() + C.getY()) / 3);
    }
}
