import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class S1 {
    public static void main(String[] args) {
        DateFormat format = new SimpleDateFormat("HH:mm:ss dd MMMM yyyy");
        Date date = new Date();
        System.out.println(format.format(date));
    }
}
