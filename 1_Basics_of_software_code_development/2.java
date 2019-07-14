public class Main {
    public static double z(double a, double b, double c) {
        return ((b+Math.sqrt(b*b + 4*a*c))/(2*a)) - Math.pow(a, 3)*c + Math.pow(b, -2);
    }

    public static void main(String[] args) {
        double result = z(1,2,3);
        System.out.println(result);
    }
}
