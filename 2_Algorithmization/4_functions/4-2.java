import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static int gcd(int a, int b) {
        if (b==0)
            return a;
        return gcd(b, a%b);
    }

    public static int gcdOfFour(int a, int b, int c, int d) {
        int mygcd=gcd(a, b);
        mygcd=gcd(mygcd, c);
        mygcd=gcd(mygcd, d);
        return mygcd;
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter four integers a, b, c and d:");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            System.out.println("GCD: " + gcdOfFour(a, b, c, d));
        }
        catch (InputMismatchException e) {
            System.out.println("Incorrect input data");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}