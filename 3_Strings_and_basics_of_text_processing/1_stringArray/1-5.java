import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a string:");
            String line = sc.nextLine();
            line = line.trim().replaceAll(" +", " ");
            System.out.println("A string without redundant spaces:");
            System.out.println(line);
        }
        catch (InputMismatchException e) {
            System.out.println("Incorrect input data");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
