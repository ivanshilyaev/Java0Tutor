import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }

    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));
    }

    public static void mostDistance(double[] x, double[] y) {
        double x1=x[0], x2=x[1], y1=y[0], y2=y[1];
        double res = distance(x1, y1, x2, y2);
        for (int i=0; i<x.length-1; ++i) {
            for (int j=i+1; j<x.length; ++j) {
                if (distance(x[i], y[i], x[j], y[j])>res) {
                    res=distance(x[i], y[i], x[j], y[j]);
                    x1=x[i]; x2=x[j]; y1=y[i]; y2=y[j];
                }
            }
        }
        System.out.println("("+x1+", "+y1+") and ("+x2+", "+y2+")");
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int n;
            do {
                System.out.println("Enter positive integer n>1 - number of points:");
                n = sc.nextInt();
            } while (n<2);
            double[] x = new double[n];
            double[] y = new double[n];
            for (int i=0; i<n; ++i) {
                x[i]=round(-50+Math.random()*100, 2);
                y[i]=round(-50+Math.random()*100, 2);
            }
            System.out.println("Original point coordinates:");
            for (int i=0; i<n; ++i)
                System.out.println(x[i]+" "+y[i]);
            System.out.println();
            System.out.println("Most distant points:");
            mostDistance(x, y);
        }
        catch (InputMismatchException e) {
            System.out.println("Incorrect input data");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}