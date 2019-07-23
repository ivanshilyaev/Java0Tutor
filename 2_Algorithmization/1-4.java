import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter n - number of elements:");
            int n = sc.nextInt();
            double arr[] = new double[n];
            for (int i=0; i<n; ++i)
                arr[i] = round(-50 + Math.random() * 100, 2); // [-50;50]
            System.out.println("Original array:");
            for (double a : arr)
                System.out.print(a + " ");
            System.out.println();
            double min=arr[0], max=arr[0];
            int min_index=0, max_index=0;
            for (int i=0; i<n; ++i) {
                if (arr[i]<min) {
                    min=arr[i];
                    min_index=i;
                }
                else if (arr[i]>max) {
                    max=arr[i];
                    max_index=i;
                }
            }
            double tmp=arr[min_index];
            arr[min_index]=arr[max_index];
            arr[max_index]=tmp;
            System.out.println("Changed array:");
            for (double a : arr)
                System.out.print(a + " ");
            System.out.println();
        }
        catch (InputMismatchException e) {
            System.out.println("Incorrect input data");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}