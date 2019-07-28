public class Main {
    public static int factorial(int n) {
        if (n==0)
            return 1;
        return n*factorial(n-1);
    }

    public static int factorialOddOneToNine() {
        int sum=0;
        for (int i=1; i<10; ++i) {
            if (i%2==1)
                sum+=factorial(i);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Sum of factorials of odd integers from 1 to 9 = " + factorialOddOneToNine());
    }
}