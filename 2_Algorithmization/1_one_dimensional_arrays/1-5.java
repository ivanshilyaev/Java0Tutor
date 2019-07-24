import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter n - number of elements:");
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i=0; i<n; ++i)
                arr[i] = -50 + (int)(Math.random() * 100); // [-50;50]
            System.out.println("Original array:");
            for (int a : arr)
                System.out.print(a + " ");
            System.out.println();
            System.out.println("Elements a_i>i:");
            for (int i=0; i<n; ++i) {
                if (arr[i]>i)
                    System.out.println(arr[i]);
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