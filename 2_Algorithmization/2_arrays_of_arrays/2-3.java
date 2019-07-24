import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
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
                    arr[i][j] = -50 + (int)(Math.random() * 100); // [-50;50]
            System.out.println("Original array:");
            for (int i=0; i<n; ++i) {
                for (int j = 0; j < n; ++j)
                    System.out.print(arr[i][j] + " ");
                System.out.println();
            }
            System.out.println();
            int k, p;
            do {
                System.out.println("Enter positive integers k and p - number of line and column:");
                k = sc.nextInt();
                p = sc.nextInt();
            } while (k<1 || k>n || p<1 || p>m);
            System.out.println("Line number " + k + ":");
            for (int j=0; j<m; ++j)
                System.out.print(arr[k-1][j] + " ");
            System.out.println();
            System.out.println("Column number " + p + ":");
            for (int i=0; i<n; ++i)
                System.out.print(arr[i][p-1] + " ");
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