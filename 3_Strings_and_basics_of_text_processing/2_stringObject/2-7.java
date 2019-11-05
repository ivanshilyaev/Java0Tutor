import java.util.InputMismatchException;
import java.util.Scanner;

// Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы

public class Main {
    public static String deleteAllSpacesAndLeaveUniqueCharacters(String line) {
        line = line.trim().replace(" ", "");
        StringBuilder res = new StringBuilder();
        for (int i=0; i<line.length(); ++i) {
            if (res.indexOf(line.charAt(i)+"") == -1) {
                res.append(line.charAt(i));
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a string:");
            String line = sc.nextLine();
            line = deleteAllSpacesAndLeaveUniqueCharacters(line);
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
