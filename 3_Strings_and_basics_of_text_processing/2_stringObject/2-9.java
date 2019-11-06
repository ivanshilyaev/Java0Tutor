import java.util.InputMismatchException;
import java.util.Scanner;

// Посчитать количество строчных (маленьких) и прописных (больших)
// букв в введенной строке. Учитывать только английские буквы

public class Main {
    public static void countLowerAndUpperLetters(String line) {
        int lower = 0, upper = 0;
        for (char ch : line.toCharArray()) {
            if (ch >= 'a' && ch <= 'z')
                ++lower;
            else if (ch >= 'A' && ch <= 'Z')
                ++upper;
        }
        System.out.println("Letters in lower case: " + lower);
        System.out.println("Letters in upper case: " + upper);
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a string:");
            String line = sc.nextLine();
            countLowerAndUpperLetters(line);
        }
        catch (InputMismatchException e) {
            System.out.println("Incorrect input data");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
