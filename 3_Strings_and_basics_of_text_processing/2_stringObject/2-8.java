import java.util.InputMismatchException;
import java.util.Scanner;

// Вводится строка слов, разделенных пробелами.
// Найти самое длинное слово и вывести его на экран

public class Main {
    public static String maxLengthWord(String line) {
        String[] array = line.split(" ");
        String res = array[0];
        for (String str : array) {
            if (str.length() > res.length()) {
                res = str;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a string:");
            String line = sc.nextLine();
            System.out.println("Word with max length:");
            System.out.println(maxLengthWord(line));
        }
        catch (InputMismatchException e) {
            System.out.println("Incorrect input data");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
