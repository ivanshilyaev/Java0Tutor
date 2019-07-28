import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
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
            System.out.println();
            Arrays.sort(arr);
            int i=arr.length-1;
            while (i>0 && arr[i]==arr[i-1])
                i--;
            if (arr.length==1 || i==0)
                System.out.println("Couldn't find second max element");
            else
                System.out.println("Second max element is " + arr[i-1]);
        }
        catch (InputMismatchException e) {
            System.out.println("Incorrect input data");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}