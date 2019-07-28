import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static boolean isPrime(int a) {
        int k=1, kol=0;
        while (k<=Math.sqrt(a)) {
            if (a%k==0) {
                kol++;
            }
            k++;
        }
        return a!=1 && kol+1==2;
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int n;
            do {
                System.out.println("Enter positive integer n>2:");
                n = sc.nextInt();
            } while (n<2);
            System.out.println("Twin primes from n to 2n:");
            boolean flag=true;
            int i=n;
            while (i<2*n-1) {
                if (isPrime(i) && isPrime(i+2)) {
                    System.out.println(i+" "+(i+2));
                    i+=2;
                    flag=false;
                }
                else ++i;
            }
            if (flag)
                System.out.println("No such integers");
        }
        catch (InputMismatchException e) {
            System.out.println("Incorrect input data");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
