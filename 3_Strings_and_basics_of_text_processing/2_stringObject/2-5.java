import java.util.InputMismatchException;
import java.util.Scanner;

// Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a string:");
            String line = sc.nextLine();

            int num = line.length() - line.replaceAll("a", "").length();
            System.out.println("Number of 'a' characters in a string:");
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
