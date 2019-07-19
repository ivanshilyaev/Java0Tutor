import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static int max(int a, int b) {
        return a>b?a:b;
    }

    public static int min(int a, int b) {
        return a<b?a:b;
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            System.out.println("max(min(a,b), min(c,d) = " + max(min(a,b), min(c,d)));
        }
        catch (InputMismatchException e) {
            System.out.println("Incorrect input data");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
