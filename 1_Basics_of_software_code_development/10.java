import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter size of a rectangular hole:");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Enter size of a brick:");
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            if ((x<=a && y<=b) || (x<=a && z<=b) || (x<=b && y<=a) || (x<=b && z<=a)
                || (y<=a && z<=b) || (y<=b && z<=a))
                System.out.println("Brick goes through a hole");
            else System.out.println("Brick doesn't go through a hole");
        }
        catch (InputMismatchException e) {
            System.out.println("Incorrect input data");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
