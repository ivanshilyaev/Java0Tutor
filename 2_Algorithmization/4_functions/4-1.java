import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
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
            System.out.println("Enter two integers n and m:");
            int n = sc.nextInt();
            int m = sc.nextInt();
            System.out.println("GCD: " + gcd(n, m));
            System.out.println("LCM: " + lcm(n, m));
        }
        catch (InputMismatchException e) {
            System.out.println("Incorrect input data");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}