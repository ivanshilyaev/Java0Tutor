import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int n;
            do {
                System.out.println("Enter positive integer n - number of elements:");
                n = sc.nextInt();
            } while (n<=0);
            int arr[] = new int[n];
            for (int i=0; i<n; ++i)
                arr[i] = -50 + (int)(Math.random() * 100); // [-50;50]
            System.out.println("Original array:");
            for (int a : arr)
                System.out.print(a + " ");
            System.out.println();
            Arrays.sort(arr);
            int res=arr[0], kol=1;
            int i=0;
            while (i<n-1) {
                int tek=1, j=i;
                while (j<n-1 && arr[j]==arr[j+1]) {
                    ++tek;
                    ++j;
                }
                if (tek>kol) {
                    kol=tek;
                    res=arr[i];
                }
                i=j+1;
            }
            System.out.println("Min of the most common numbers = " + res);
        }
        catch (InputMismatchException e) {
            System.out.println("Incorrect input data");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}