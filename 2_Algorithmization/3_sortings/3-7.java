import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void printArray(int[] arr, int n) {
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static final int MAX_SIZE=300;

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int n, m;
            do {
                System.out.println("Enter positive integers n and m - sizes of two arrays (n<100, m<100):");
                n = sc.nextInt();
                m = sc.nextInt();
            } while (n<1 || m<1 || n>100 || m>100);
            int[] arr1 = new int[MAX_SIZE];
            int[] arr2 = new int[m];
            for (int i=0; i<n; ++i)
                arr1[i]=-50+(int)(Math.random()*100);
            Arrays.sort(arr1, 0, n);
            for (int i=0; i<m; ++i)
                arr2[i]=-50+(int)(Math.random()*100);
            Arrays.sort(arr2, 0, m);
            System.out.println("Original arrays:");
            printArray(arr1, n);
            printArray(arr2, m);
            System.out.println("Places to insert new elements:");
            int index=0;
            for (int j=0; j<m; ++j) {
                while (arr2[j]>arr1[index])
                    ++index;
                System.out.println(index+1);
                for (int i=n+j; i>index; --i)
                    arr1[i]=arr1[i-1];
                arr1[index]=arr2[j];
            }
            System.out.println("Merged array:");
            printArray(arr1, n+m);
        }
        catch (InputMismatchException e) {
            System.out.println("Incorrect input data");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}