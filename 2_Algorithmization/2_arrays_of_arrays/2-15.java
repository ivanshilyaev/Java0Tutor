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
            } while (n<=0 || m<=0 || n<m);
            int arr[][] = new int[n][m];
            for (int i=0; i<n; ++i) {
                for (int j = 0; j < m; ++j)
                    arr[i][j] = -50+(int)(Math.random()*100);
            }
            System.out.println("Original array:");
            printArray(arr, n, m);
            System.out.println();
            int max=arr[0][0];
            for (int i=0; i<n; ++i) {
                for (int j = 0; j < m; ++j) {
                    if (arr[i][j]>max)
                        max=arr[i][j];
                }
            }
            for (int i=0; i<n; ++i) {
                for (int j = 0; j < m; ++j) {
                    if (Math.abs(arr[i][j])%2==1)
                        arr[i][j]=max;
                }
            }
            System.out.println("Max element = " + max);
            System.out.println();
            System.out.println("Changed array:");
            printArray(arr, n, m);
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