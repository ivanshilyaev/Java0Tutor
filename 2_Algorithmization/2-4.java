import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int n;
            do {
                System.out.println("Enter positive even integer n - size square of matrix:");
                n = sc.nextInt();
            } while (n<=0 || n%2!=0);
            int arr[][] = new int[n][n];
            for (int i=0; i<n; i+=2)
                for (int j=0; j<n; ++j)
                    arr[i][j]=j+1;
            for (int i=1; i<n; i+=2)
                for (int j=0; j<n; ++j)
                    arr[i][j]=n-j;
            System.out.println("Original array:");
            for (int i=0; i<n; ++i) {
                for (int j = 0; j < n; ++j)
                    System.out.print(arr[i][j] + " ");
                System.out.println();
            }
        }
        catch (InputMismatchException e) {
            System.out.println("Incorrect input data");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}