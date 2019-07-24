import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int n;
            do {
                System.out.println("Enter positive even integer n - number of elements:");
                n = sc.nextInt();
            } while (n<=0 || n%2!=0);
            int arr[] = new int[n];
            for (int i=0; i<n; ++i)
                arr[i] = -50 + (int)(Math.random() * 100); // [-50;50]
            System.out.println("Original array:");
            for (int a : arr)
                System.out.print(a + " ");
            System.out.println();
            int min=arr[0];
            for (int i=1; i<n; ++i) {
                if (arr[i]<min)
                    min=arr[i];
            }
            --min;
            // помечаем каждый второй элемент
            for (int i=0; i<n; ++i) {
                if (i%2!=0)
                    arr[i]=min;
            }
            for (int i=0; i<n-1; ++i) {
                if (arr[i]==min) {
                    for (int j=i; j<n-1; ++j) {
                        int tmp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=tmp;
                    }
                }
            }
            int j=n-1;
            while (arr[j]==min) {
                arr[j]=0;
                --j;
            }
            System.out.println("Result:");
            for (int i=0; i<n/2; ++i)
                System.out.print(arr[i] + " ");
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
