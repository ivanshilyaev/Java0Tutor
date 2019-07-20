import java.math.BigDecimal;

public class Main {
    public static BigDecimal f(int n) {
        if (n==1)
            return BigDecimal.ONE;
        else return (new BigDecimal(n)).multiply((new BigDecimal(n)).multiply(f(n-1)));
    }
    
    public static void main(String[] args) {
        System.out.println("Multiplication of squares of numbers from 1 to 200 equals " + f(200));
    }
}
