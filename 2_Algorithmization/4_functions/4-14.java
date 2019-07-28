import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static boolean isArm(int a) {
        int[] d=new int[10];
        int n=0, b=a;
        while (a>0) {
            int c=a%10;
            int k=0;
            for (int i=0; i<n; i++)
                if (d[i]==c)
                    k++;
            if (k==0)
                d[n++]=c;
            a/=10;
        }
        int sum=0;
        for (int i=0; i<n; i++)
            sum+=Math.pow(d[i], n);
        return b==sum;
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int n;
            do {
                System.out.println("Enter positive integer n:");
                n = sc.nextInt();
            } while (n<1);
            System.out.println("Narcissistic number from 1 to n:");
            for (int i=1; i<=n; ++i) {
                if (isArm(i))
                    System.out.println(i);
            }
        }
        catch (InputMismatchException e) {
            System.out.println("Incorrect input data");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
