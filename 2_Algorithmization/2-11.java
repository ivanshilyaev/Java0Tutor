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
            int n=10, m=20;
            int arr[][] = new int[n][m];
            for (int i=0; i<n; ++i)
                for (int j=0; j<m; ++j)
                    arr[i][j]=(int)(Math.random()*15); // [0;15]
            System.out.println("Original array:");
            printArray(arr, n, m);
            System.out.println();
            int lines[] = new int[n];
            for (int i=0; i<n; ++i)
                lines[i]=0;
            for (int i=0; i<n; ++i)
                for (int j=0; j<m; ++j)
                    if (arr[i][j]==5)
                        lines[i]++;
            System.out.println("Indexes of lines which contain number 5 three or more times:");
            for (int i=0; i<n; ++i)
                if (lines[i]>2)
                    System.out.print((i+1)+" ");
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