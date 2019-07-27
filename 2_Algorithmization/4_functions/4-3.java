import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static double square(double a) {
        return 3*a*a*Math.sqrt(3)/2;
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter double a - side of a regular hexagon:");
            double a = sc.nextDouble();
            System.out.println("Square: " + square(a));
        }
        catch (InputMismatchException e) {
            System.out.println("Incorrect input data");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
