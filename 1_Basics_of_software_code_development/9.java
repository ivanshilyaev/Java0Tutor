import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the first point:");
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            System.out.println("Enter the second point:");
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            System.out.println("Enter the third point:");
            int x3 = sc.nextInt();
            int y3 = sc.nextInt();
            if (((x3-x1)/(x2-x1)) == ((y3-y1)/(y2-y1)))
                System.out.println("Points are on the same line");
            else System.out.println("Points aren't on the same line");
        }
        catch (InputMismatchException e) {
            System.out.println("Incorrect input data");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
