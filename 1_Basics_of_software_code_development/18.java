import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void printDivs(int a) {
        for (int i=2; i<=a/2; ++i)
            if (a%i==0)
                System.out.print(i+" ");
        System.out.println();
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter segment boundaries m and n:");
            int m = sc.nextInt();
            int n = sc.nextInt();
            while (m>n) {
                System.out.println("Incorrect input data, try again");
                m = sc.nextInt();
                n = sc.nextInt();
            }
            for (int i=m; i<=n; ++i) {
                System.out.print(i + ": ");
                printDivs(i);
            }
        }
        catch (InputMismatchException e) {
            System.out.println("Incorrect input data");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

