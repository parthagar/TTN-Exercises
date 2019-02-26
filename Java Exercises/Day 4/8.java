import java.text.SimpleDateFormat;
import java.util.Date;

class Exercise_4_8 {

    public static void main(String[] args) {

        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMMM-yyyy");
        System.out.println(formatter.format(date));

    }
}
