import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void printArray(int arr[][], int n, int m) {
        for (int i=0; i<n; ++i) {
            for (int j=0; j<m; ++j)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int n, m;
            do {
                System.out.println("Enter positive integers n and m - size of matrix (n>=m):");
                // при n>=m условие наличия в каждом столбце столько же едениц, каков и его номер,
                // выглядит логичным. поскольку в последнем столбце (как и во всех остальных)
                // кол-во едениц равно номеру, то кол-во строк не меньше кол-ва столбцов
                n = sc.nextInt();
                m = sc.nextInt();
            } while (n<=0 || m<=0 || n<m);
            int arr[][] = new int[n][m];
            for (int i=0; i<n; ++i) {
                for (int j = 0; j < m; ++j)
                    arr[i][j] = 0;
            }
            for (int j=0; j<Math.min(n, m); ++j) {
                for (int i=0; i<j+1; ++i) {
                    int index = (int) (Math.random() * (n));
                    while (arr[index][j]==1) {
                        index = (int) (Math.random() * (n));
                    }
                    arr[index][j]=1;
                }
            }
            System.out.println("Original array:");
            printArray(arr, n, m);
            System.out.println();
        }
        catch (InputMismatchException e) {
            System.out.println("Incorrect input data");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}