import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int n;
            do {
                System.out.println("Enter positive integer n:");
                n = sc.nextInt();
            } while (n<1);
            String[] array = new String[n];
            System.out.println("Enter n strings in camelCase:");
            for (int i=0; i<n; ++i) {
                array[i] = sc.next();
            }
            for (int i=0; i<n; ++i) {
                StringBuilder tmp = new StringBuilder();
                for (int j=0; j<array[i].length(); ++j) {
                    if (Character.isUpperCase(array[i].charAt(j))) {
                        tmp.append("_");
                        tmp.append(Character.toLowerCase(array[i].charAt(j)));
                    }
                    else
                        tmp.append(array[i].charAt(j));
                }
                array[i] = tmp.toString();
            }
            System.out.println("camelCase -> snake_case");
            for (int i=0; i<n; ++i)
                System.out.println(array[i]);

        }
        catch (InputMismatchException e) {
            System.out.println("Incorrect input data");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
