import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static String time(int t) throws Exception {
        if (t<0)
            throw new Exception("Invalid data");
        int h = t/3600;
        t%=3600;
        int m = t/60;
        t%=60;
        Date date = new Date();
        date.setHours(h);
        date.setMinutes(m);
        date.setSeconds(t);
        SimpleDateFormat dateFormat = new SimpleDateFormat("HHч mmмин ssс");
        return dateFormat.format(date);
    }

    public static void main(String[] args) {
        try {
            System.out.println(time(5872));
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
