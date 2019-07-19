public class Main {
    public static int sumOfSquares() {
        int sum = 0;
        for (int i=1; i<=100; ++i)
            sum+=Math.pow(i, 2);
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Sum of squares from 1 to 100 equals " + sumOfSquares());
    }
}
