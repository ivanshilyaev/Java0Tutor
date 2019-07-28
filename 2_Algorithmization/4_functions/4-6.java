import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static boolean areCoprime(int a, int b, int c) {
        int mygcd=gcd(a,b);
        mygcd=gcd(mygcd,c);
        return mygcd==1;
    }

    public static int gcd(int a, int b){
        if (b==0)
            return a;
        return gcd(b, a%b);
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int a, b, c;
            do {
                System.out.println("Enter three positive integers a, b, c:");
                a = sc.nextInt();
                b = sc.nextInt();
                c = sc.nextInt();
            } while (a<1 || b<1 || c<1);
            if (areCoprime(a,b,c))
                System.out.println("Integers are coprime");
            else
                System.out.println("Integers aren't coprime");
        }
        catch (InputMismatchException e) {
            System.out.println("Incorrect input data");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}