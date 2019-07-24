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
                    arr[i][j]=-50 + (int)(Math.random()*100);
            System.out.println("Original array:");
            for (int i=0; i<n; ++i) {
                for (int j=0; j<m; ++j)
                    System.out.print(arr[i][j] + " ");
                System.out.println();
            }
            int a, b;
            do {
                System.out.println("Enter positive integers a and b - numbers" +
                        " of columns you'd like to change");
                a = sc.nextInt();
                b = sc.nextInt();
            } while (a<1 || a>n || b<1 || b>n || a==b);
            for (int i=0; i<n; ++i) {
                int tmp=arr[i][a-1];
                arr[i][a-1]=arr[i][b-1];
                arr[i][b-1]=tmp;
            }
            System.out.println("Changed array:");
            for (int i=0; i<n; ++i) {
                for (int j=0; j<m; ++j)
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