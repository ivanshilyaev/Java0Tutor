import java.math.BigDecimal;

public class Main {
    public static BigDecimal f() {
        BigDecimal m = BigDecimal.ONE;
        for (int i=1; i<=200; ++i) {
            BigDecimal a = new BigDecimal(Math.pow(i, 2));
            m=m.multiply(a);
        }
        return m;
    }

    public static void main(String[] args) {
        System.out.println("Multiplication of squares of numbers from 1 to 200 equals " + f());
    }
}
