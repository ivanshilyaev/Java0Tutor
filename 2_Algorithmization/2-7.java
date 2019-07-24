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
            int n;
            do {
                System.out.println("Enter positive integer n - size square of matrix:");
                n = sc.nextInt();
            } while (n<=0);
            double arr[][] = new double[n][n];
            for (int i=0; i<n; ++i)
                for (int j=0; j<n; ++j)
                    arr[i][j]=round(Math.sin((i*i-j*j)/n), 3);
            System.out.println("Original array:");
            for (int i=0; i<n; ++i) {
                for (int j = 0; j < n; ++j)
                    System.out.print(arr[i][j] + " ");
                System.out.println();
            }
            int pos=0;
            for (int i=0; i<n; ++i)
                for (int j=0; j<n; ++j)
                    if (arr[i][j]>0)
                        pos++;
            System.out.println("Number of positive elements = " + pos);
        }
        catch (InputMismatchException e) {
            System.out.println("Incorrect input data");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}