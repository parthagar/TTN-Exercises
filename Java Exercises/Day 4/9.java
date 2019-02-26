import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

class Exercise_4_9 {

    public static void main(String[] args) {

        Date date = new Date();

        DateFormat formatter1 = DateFormat.getTimeInstance(DateFormat.MEDIUM, Locale.CHINESE);
        DateFormat formatter2 = DateFormat.getTimeInstance(DateFormat.MEDIUM, Locale.UK);
        DateFormat formatter3 = DateFormat.getTimeInstance(DateFormat.MEDIUM, Locale.US);

        System.out.println(formatter1.format(date));
        System.out.println(formatter2.format(date));
        System.out.println(formatter3.format(date));
    }
}
