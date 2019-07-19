import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter int a and b:");
            int a = sc.nextInt();
            int b = sc.nextInt();
            boolean[] arr1 = new boolean[10];
            for (int i=0; i<10; ++i)
                arr1[i]=false;
            boolean[] arr2 = new boolean[10];
            for (int i=0; i<10; ++i)
                arr2[i]=false;

            while (a>0) {
                arr1[a%10]=true;
                a/=10;
            }

            while (b>0) {
                arr2[b%10]=true;
                b/=10;
            }

            boolean f = false;
            for (int i=0; i<10; ++i) {
                if (arr1[i] && arr2[i]) {
                    System.out.print(i + " ");
                    f = true;
                }
            }
            System.out.println();
            if (!f)
                System.out.println("No digits which are in both integers");
        }
        catch (InputMismatchException e) {
            System.out.println("Incorrect input data");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

