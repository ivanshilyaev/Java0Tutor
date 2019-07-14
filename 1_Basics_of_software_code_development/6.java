public class Main {
    public static boolean isIn(double x, double y) {
        if (x*x+(y+1)*(y+1)<0.25) // a=0, b=-1, r=0.5
            return false;
        if (x>4 || x<-4 || y>4 || y<-3)
            return false;
        if (x>2 && y>0)
            return false;
        if (x<-2 && y>0)
            return false;
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIn(0, 0));
    }
}
