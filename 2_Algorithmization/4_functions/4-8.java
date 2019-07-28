import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static int sumOfThree(int[] arr, int begin) {
        return arr[begin]+arr[begin+1]+arr[begin+2];
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int n;
            do {
                System.out.println("Enter positive integer n - size of array:");
                n = sc.nextInt();
            } while (n<1);
            int[] arr = new int[n];
            for (int i=0; i<n; ++i)
                arr[i]=-50+(int)(Math.random()*100);
            System.out.println("Original array");
            for (int i=0; i<n; ++i)
                System.out.print(arr[i]+" ");
            int i=0;
            System.out.println("Sums like a[1]+a[2]+[3], [a+3]+a[4]+a[5] ...");
            while (i<arr.length-2) {
                System.out.println(sumOfThree(arr, i));
                i+=2;
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
