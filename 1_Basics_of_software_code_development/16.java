import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static double aN(double n) {
        return 1/Math.pow(2, n) + 1/Math.pow(3, n);
    }

    public static double sum(double e) {
        int n=1;
        double sum=0, a;
        // since series converge
        while ((a=aN(n)) >= e) {
            sum+=a;
            ++n;
        }
        return sum;
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter double e");
            double e = sc.nextDouble();
            System.out.println("sum = " + sum(e));
        }
        catch (InputMismatchException e) {
            System.out.println("Incorrect input data");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
