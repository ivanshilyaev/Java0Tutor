import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static int sum(int n) {
        int sum = 0;
        for (int i=1; i<=n; ++i)
            sum+=i;
        return sum;
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter integer positive number n:");
            int n = sc.nextInt();
            while (n<=0) {
                System.out.println("Incorrect input data, try again");
                n = sc.nextInt();
            }
            System.out.println("Sum from 1 to n equals " + sum(n));
        }
        catch (InputMismatchException e) {
            System.out.println("Incorrect input data");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
