public class Main {
    public static double change(double num) {
        int a = (int)num;
        double b=(double) a/1000;
        num*=1000;
        num%=1000;
        return num+b;
    }

    public static void main(String[] args) {
        double result = change(123.789);
        System.out.println(result);
    }
}
