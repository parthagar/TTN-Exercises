import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class Exercise_5_5 {

    public static void main(String[] args) {

        Consumer consumer = e -> System.out.println(e);
        consumer.accept(2);

        Supplier supplier = () -> 2;
        System.out.println(supplier.get());

        Predicate predicate = e -> ((int)e % 2) == 0;
        System.out.println(predicate.test(3));

        Function function = e -> e.hashCode();
        System.out.println(function.apply("abc"));
    }

}
