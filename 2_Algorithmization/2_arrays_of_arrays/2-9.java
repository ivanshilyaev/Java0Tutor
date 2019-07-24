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
                    arr[i][j]=(int)(Math.random()*100); // [0;100]
            System.out.println("Original array:");
            printArray(arr, n, m);
            int col[] = new int[m];
            for (int j=0; j<m; ++j)
                col[j]=0;
            for (int i=0; i<n; ++i)
                for (int j=0; j<m; ++j)
                    col[j]+=arr[i][j];
            System.out.println();
            System.out.println("Sum of elements in each column:");
            for (int j=0; j<m; ++j)
                System.out.print(col[j]+" ");
            System.out.println();
            int max=col[0], index=0;
            for (int j=1; j<m; ++j) {
                if (col[j] > max) {
                    max=col[j];
                    index=j;
                }
            }
            System.out.println("Index of column with max sum of elements = " + (index+1));
        }
        catch (InputMismatchException e) {
            System.out.println("Incorrect input data");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}