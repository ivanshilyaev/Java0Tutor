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

    public static boolean isPrime(int a) {
        int k=1, kol=0;
        while (k<=Math.sqrt(a)) {
            if (a%k==0)
                kol++;
            k++;
        }
        if (a!=1 && kol+1==2)
            return true;
        return false;
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
            double sum=0;
            for (int i=0; i<n; ++i) {
                if (isPrime(i))
                    sum+=arr[i];
            }
            System.out.println("Sum of elements which indexes are prime numbers = " + sum);
        }
        catch (InputMismatchException e) {
            System.out.println("Incorrect input data");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}