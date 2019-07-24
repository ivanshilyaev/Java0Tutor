import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int n;
            do {
                System.out.println("Enter positive odd integer n - number of elements:");
                n = sc.nextInt();
            } while (n<=0 || n%2!=0);
            int arr[] = new int[n];
            for (int i=0; i<n; ++i)
                arr[i] = -50 + (int)(Math.random() * 100); // [-50;50]
            System.out.println("Original array:");
            for (int a : arr)
                System.out.print(a + " ");
            System.out.println();
            int max=arr[0]+arr[n-1];
            for (int i=1; i<n/2; ++i) {
                if (arr[i]+arr[n-i-1]>max)
                    max=arr[i]+arr[n-i-1];
            }
            System.out.println("max(a_1+a_n, a_2+a_(n-1), ...) = " + max);
        }
        catch (InputMismatchException e) {
            System.out.println("Incorrect input data");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}