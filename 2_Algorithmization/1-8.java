import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int n;
            do {
                System.out.println("Enter positive integer n - number of elements:");
                n = sc.nextInt();
            } while (n<=0);
            int arr[] = new int[n];
            for (int i=0; i<n; ++i)
                arr[i] = -50 + (int)(Math.random() * 100); // [-50;50]
            System.out.println("Original array:");
            for (int a : arr)
                System.out.print(a + " ");
            System.out.println();
            int min=arr[0];
            for (int i=0; i<n; ++i) {
                if (arr[i]<min)
                    min=arr[i];
            }
            int kol=0;
            for (int i=0; i<n; ++i) {
                if (arr[i]==min)
                    ++kol;
            }
            int m=n-kol, j=0;
            int res[] = new int[m];
            for (int i=0; i<n; ++i) {
                if (arr[i]!=min) {
                    res[j]=arr[i];
                    ++j;
                }
            }
            System.out.println("Result:");
            for (j=0; j<m; ++j)
                System.out.print(res[j]+" ");
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