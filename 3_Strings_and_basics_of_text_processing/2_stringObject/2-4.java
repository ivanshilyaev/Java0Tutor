import java.util.InputMismatchException;
import java.util.Scanner;

// С помощью функции копирования и операции конкатенации
// составить из частей слова “информатика” слово “торт”.

public class Main {
    public static void main(String[] args) {
        try {
            String line = "информатика";
            String res = line.substring(7, 8) + line.substring(3, 5) + line.substring(7, 8);
            System.out.println(res);
        }
        catch (InputMismatchException e) {
            System.out.println("Incorrect input data");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
