import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a string:");
            String line = sc.next();
            line = line.replaceAll("\\D", ".");
            StringTokenizer token = new StringTokenizer(line, ".");
            int num = token.countTokens();
            System.out.println("Number of integers in a string:");
            System.out.println(num);
        }
        catch (InputMismatchException e) {
            System.out.println("Incorrect input data");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
