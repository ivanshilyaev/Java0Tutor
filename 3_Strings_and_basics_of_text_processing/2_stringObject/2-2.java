import java.util.InputMismatchException;
import java.util.Scanner;

// В строке вставить после каждого символа 'a' символ 'b'.

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a string:");
            String line = sc.nextLine();

            line = line.replaceAll("a", "ab");
            System.out.println("Modified string:");
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
