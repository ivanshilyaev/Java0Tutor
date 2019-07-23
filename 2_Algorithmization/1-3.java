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

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter n - number of elements:");
            int n = sc.nextInt();
            double arr[] = new double[n];
            for (int i=0; i<n; ++i)
                arr[i] = round(-50 + Math.random() * 100, 2); // [-50;50]
            System.out.println("Original array:");
            for (double a : arr)
                System.out.print(a + " ");
            int neg=0, zer=0, pos=0;
            for (double a : arr) {
                if (a>0)
                    ++pos;
                else if (a<0)
                    ++neg;
                else
                    ++zer;
            }
            System.out.println();
            System.out.println("Number of negative elements = " + neg);
            System.out.println("Number of positive elements = " + pos);
            System.out.println("Number of zero elements = " + zer);
        }
        catch (InputMismatchException e) {
            System.out.println("Incorrect input data");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}