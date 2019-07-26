import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void printArray(int[] arr) {
        for (int i=0; i<arr.length; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void shellSort(int[] arr, int n) {
        int step, i, j, temp;
        for (step = n / 2; step > 0; step /= 2) {
            for (i = step; i < n; ++i) {
                for (j = 0; j < i; ++j) {
                    if (arr[j] > arr[i]) {
                        temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                    }
                }
            }
        }

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
            System.out.println("Original array:");
            printArray(arr);
            // Shell sort - сортировка Шелла
            shellSort(arr, n);
            System.out.println("Sorted array:");
            printArray(arr);
        }
        catch (InputMismatchException e) {
            System.out.println("Incorrect input data");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}