import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void printArray(int arr[][], int n, int m) {
        for (int i=0; i<n; ++i) {
            for (int j=0; j<m; ++j)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int n;
            do {
                System.out.println("Enter positive integer n - size square of matrix:");
                n = sc.nextInt();
            } while (n<=0);
            int arr[][] = new int[n][n];
            for (int i=0; i<n; ++i)
                for (int j=0; j<n; ++j)
                    arr[i][j]=-50+(int)(Math.random()*100); // [-50;50]
            System.out.println("Original array:");
            printArray(arr, n, n);
            System.out.println();
            System.out.println("Positive elements in main diagonal:");
            for (int i=0; i<n; ++i)
                if (arr[i][i]>0)
                    System.out.print(arr[i][i]+" ");
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