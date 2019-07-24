import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int n, m;
            do {
                System.out.println("Enter positive integer n - size of square matrix:");
                n = sc.nextInt();
            } while (n<=0);
            int arr[][] = new int[n][n];
            for (int i=0; i<n; ++i)
                for (int j=0; j<n; ++j)
                    arr[i][j] = -50 + (int)(Math.random() * 100); // [-50;50]
            System.out.println("Original array:");
            for (int i=0; i<n; ++i) {
                for (int j = 0; j < n; ++j)
                    System.out.print(arr[i][j] + " ");
                System.out.println();
            }
            System.out.println();
            System.out.println("Diagonal elements:");
            for (int i=0; i<n; ++i)
                System.out.print(arr[i][i] + " ");
            System.out.println();
        }
        catch (InputMismatchException e) {
            System.out.println("Incorrect input data");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}