import java.util.ArrayList;
import java.util.Iterator;

class Exercise_4_1 {

    public static void main(String[] args) {
        ArrayList<Float> l = new ArrayList<Float>(5);

        l.add(3.0f);
        l.add(4.0f);
        l.add(1.0f);
        l.add(5.0f);
        l.add(2.0f);

        Iterator<Float> it = l.iterator();

        Float sum = 0.0f;

        while(it.hasNext()){
            sum = sum + it.next();
        }

        System.out.println(sum);
    }
}
