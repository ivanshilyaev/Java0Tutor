import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void printArray(int[] arr) {
        for (int i=0; i<arr.length; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static int binarySearch(int[] arr, int n, int key) {
        int l = -1;
        int r = n;
        while (l < r - 1) {
            int m = (l + r) / 2;
            if (arr[m] < key)
                l = m;
            else
                r = m;
        }
        return r;
    }

    public static void insertionSort(int[] arr, int n) {
        for (int i=1; i<n; ++i) {
            int x=arr[i];
            int j=binarySearch(arr, i, x);
            for (int k=i; k>j; --k)
                arr[k]=arr[k-1];
            arr[j]=x;
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
            // insertion sort - сортировка вставками
            insertionSort(arr, n);
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