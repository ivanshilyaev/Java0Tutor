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
            int n, m;
            do {
                System.out.println("Enter positive integers n and m - size of matrix:");
                n = sc.nextInt();
                m = sc.nextInt();
            } while (n<=0 || m<=0);
            int arr[][] = new int[n][m];
            for (int i=0; i<n; ++i)
                for (int j=0; j<m; ++j)
                    arr[i][j]=-50+(int)(Math.random()*100); // [-50;50]
            System.out.println("Original array:");
            printArray(arr, n, m);
            System.out.println();
            System.out.println("Sorting lines in ascending order...");
            for (int i=0; i<n; ++i)
                Arrays.sort(arr[i]);
            System.out.println("Sorted array:");
            printArray(arr, n, m);
            System.out.println();
            System.out.println("Sorting lines in descending order...");
            for (int i=0; i<n; ++i) {
                for (int j=0; j<m; ++j)
                    arr[i][j]*=(-1);
                Arrays.sort(arr[i]);
                for (int j=0; j<m; ++j)
                    arr[i][j]*=(-1);
            }
            System.out.println("Sorted array:");
            printArray(arr, n, m);
        }
        catch (InputMismatchException e) {
            System.out.println("Incorrect input data");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
