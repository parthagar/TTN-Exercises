import java.text.SimpleDateFormat;
import java.util.Date;

public class sample {

    public static void main(String[] args) {

        Date set_date = new Date(117, 9, 22, 3, 40, 50);
        SimpleDateFormat date = new SimpleDateFormat("dd-yyyy-MM");
        SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss");

        System.out.println(date.format(set_date));
        System.out.println(time.format(set_date));

    }
}
