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
            System.out.println("Sorting columns in ascending order...");
            for (int j=0; j<m; ++j) {
                for (int i=0; i<n-1; ++i) {
                    for (int k=i+1; k<n; ++k) {
                        if (arr[i][j]>arr[k][j]) {
                            int tmp=arr[i][j];
                            arr[i][j]=arr[k][j];
                            arr[k][j]=tmp;
                        }
                    }
                }
            }
            System.out.println("Sorted array:");
            printArray(arr, n, m);
            System.out.println();
            System.out.println("Sorting columns in descending order...");
            for (int j=0; j<m; ++j) {
                for (int i=0; i<n/2; ++i) {
                    int tmp=arr[i][j];
                    arr[i][j]=arr[n-i-1][j];
                    arr[n-i-1][j]=tmp;
                }
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