import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void printArray(int[] arr, int n) {
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void selectionSort(int[] arr, int n) {
        for (int i=0; i<n-1; ++i) {
            int index=i;
            for (int j=i+1; j<n; ++j) {
                if (arr[j]>arr[index]) {
                    index = j;
                }
            }
            int tmp=arr[i];
            arr[i]=arr[index];
            arr[index]=tmp;
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
            // selection sort - сортировка выбором
            selectionSort(arr, n);
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
