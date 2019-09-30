import java.util.InputMismatchException;
import java.util.Scanner;

// Проверить, является ли заданное слово палиндромом.

public class Main {
    public static boolean isPal(String line) {
        StringBuilder sb = new StringBuilder(line);
        return line.equals(sb.reverse().toString());
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a string:");
            String line = sc.nextLine();
            System.out.println(isPal(line));
        }
        catch (InputMismatchException e) {
            System.out.println("Incorrect input data");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
