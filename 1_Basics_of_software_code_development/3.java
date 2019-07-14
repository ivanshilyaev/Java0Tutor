public class Main {
    public static double z(double x, double y) {
        return (Math.sin(x)+Math.cos(y))/(Math.cos(x)-Math.sin(y))*Math.tan(x*y);
    }

    public static void main(String[] args) {
        double result = z(Math.PI/2, Math.PI/2);
        System.out.println(result);
    }
}
