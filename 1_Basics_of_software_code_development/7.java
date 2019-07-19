import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a + b >= 180)
                System.out.println("Not a triangle");
            else if (a == 90 || b == 90 || (180 - a - b) == 90)
                System.out.println("Right triangle");
            else System.out.println("Triangle");
        }
        catch (InputMismatchException e) {
            System.out.println("Incorrect input data");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
