import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void printFractions(int[] arr1, int[] arr2) {
        for (int i=0; i<arr1.length; ++i)
            System.out.print(arr1[i] + "/" + arr2[i] + " ");
        System.out.println();
    }

    public static int gcd(int a, int b) {
        if (b==0)
            return a;
        return gcd(b, a%b);
    }

    public static int lcm(int a, int b) {
        return a*b/gcd(a, b);
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int n;
            do {
                System.out.println("Enter positive integer n - size of two arrays (numerators and denominators):");
                n = sc.nextInt();
            } while (n<1);
            int[] arr1 = new int[n];
            int[] arr2 = new int[n];
            for (int i=0; i<n; ++i)
                arr1[i]=(int)(Math.random()*100);
            for (int i=0; i<n; ++i)
                arr2[i]=1+(int)(Math.random()*100);
            System.out.println("Original fractions:");
            printFractions(arr1, arr2);
            int mylcm=arr2[0];
            for (int i=1; i<n; ++i)
                mylcm=lcm(mylcm, arr2[i]);
            for (int i=0; i<n; ++i) {
                arr1[i]*=(mylcm/arr2[i]);
                arr2[i]=mylcm;
            }
            System.out.println(mylcm);
            for (int i=0; i<n-1; ++i) {
                for (int j=i+1; j<n; ++j) {
                    if (arr1[i]>arr2[j]) {
                        int tmp=arr1[i]; arr1[i]=arr1[j]; arr1[j]=tmp;
                        tmp=arr2[i]; arr2[i]=arr2[j]; arr2[j]=tmp;
                    }
                }
            }
            System.out.println("Sorted fractions:");
            printFractions(arr1, arr2);
        }
        catch (InputMismatchException e) {
            System.out.println("Incorrect input data");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}