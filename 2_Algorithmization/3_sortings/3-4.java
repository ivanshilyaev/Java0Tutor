import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void printArray(int[] arr, int n) {
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void bubbleSort(int[] arr, int n) {
        for (int j=0; j<n-1; ++j) {
            int f=0;
            for (int i = 0; i < n - j -1; ++i) {
                if (arr[i] > arr[i + 1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                    f=1;
                }
            }
            if (f==0)
                return;
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
            // bubble sort - сортировка пузырьком (обменами)
            bubbleSort(arr, n);
            System.out.println("Sorted array:");
            printArray(arr, n);
        }
        catch (InputMismatchException e) {
            System.out.println("Incorrect input data");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}