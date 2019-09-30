import java.util.InputMismatchException;
import java.util.Scanner;

// Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a string:");
            String line = sc.nextLine();

            int num=0;
            while (line.indexOf(' ') != -1) {
                int tmp = line.length() - line.replaceFirst("\\s+", "").length();
                line = line.replaceFirst("\\s+", "");
                if (tmp > num)
                    num = tmp;
            }
            System.out.println("Most number of spaces in a row:");
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
