import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static double f(double x) {
        if (x<=3)
            return (Math.pow(x, 2) - 3*x + 9);
        else
            return 1/(Math.pow(x, 3) + 6);
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter x:");
            double x = sc.nextDouble();
            System.out.println("F(x) = " + f(x));
        }
        catch (InputMismatchException e) {
            System.out.println("Incorrect input data");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
