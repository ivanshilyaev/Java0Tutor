import java.util.InputMismatchException;
import java.util.Scanner;

// Из заданной строки получить новую, повторив каждый символ дважды.

public class Main {
    public static String repeatTwice(String line) {
        String res = "";
        for (int i=0; i<line.length(); ++i) {
            res += line.substring(i, i+1) + line.substring(i, i+1);
        }
        return res;
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a string:");
            String line = sc.nextLine();
            line = repeatTwice(line);
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
