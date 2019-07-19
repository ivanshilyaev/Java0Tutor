import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static double f(double x) {
        if (x>2)
            return x;
        else
            return -x;
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter segment boundaries a and b:");
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            while (a>b) {
                System.out.println("Incorrect input data, try again");
                a = sc.nextDouble();
                b = sc.nextDouble();
            }
            System.out.println("Enter step h:");
            double h = sc.nextDouble();
            for (double i=a; i<=b; i+=h)
                System.out.println(f(i));
        }
        catch (InputMismatchException e) {
            System.out.println("Incorrect input data");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
