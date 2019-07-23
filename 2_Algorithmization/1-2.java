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
            System.out.println("Enter integer z:");
            int z = sc.nextInt();
            System.out.println("Original array:");
            for (int a : arr)
                System.out.print(a + " ");
            System.out.println();
            int kol=0;
            for (int i=0; i<n; ++i) {
                if (arr[i]>z) {
                    arr[i] = z;
                    ++kol;
                }
            }
            System.out.println("Changed array:");
            for (int a : arr)
                System.out.print(a + " ");
            System.out.println();
            System.out.println("Number of changes = " + kol);
        }
        catch (InputMismatchException e) {
            System.out.println("Incorrect input data");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}