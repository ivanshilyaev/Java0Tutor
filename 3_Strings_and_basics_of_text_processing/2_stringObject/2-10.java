import java.util.InputMismatchException;
import java.util.Scanner;

// Строка X состоит из нескольких предложений, каждое из которых кончается точкой,
// восклицательным или вопросительным знаком. Определить количество предложений в строке X.


public class Main {
    public static int countSentences(String text) {
        int count = 0;
        while (text.indexOf('.') != -1) {
            ++count;
            text = text.replaceFirst("\\.", "");
        }
        while (text.indexOf('!') != -1) {
            ++count;
            text = text.replaceFirst("!", "");
        }
        while (text.indexOf('?') != -1) {
            ++count;
            text = text.replaceFirst("\\?", "");
        }
        return count;
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter test:");
            String text = sc.nextLine();
            System.out.println("Number of sentences: " + countSentences(text));
        }
        catch (InputMismatchException e) {
            System.out.println("Incorrect input data");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
