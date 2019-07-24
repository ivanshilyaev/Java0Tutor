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
                arr[i] = (int)(Math.random() * 100);
            System.out.println("Enter integer k:");
            int k = sc.nextInt();
            int sum = 0;
            for (int a : arr) {
                if (a % k == 0)
                    sum += a;
            }
            System.out.println("Original array:");
            for (int a : arr)
                System.out.print(a + " ");
            System.out.println();
            System.out.println("Sum of elements divided by " + k +":");
            System.out.println(sum);

        }
        catch (InputMismatchException e) {
            System.out.println("Incorrect input data");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}