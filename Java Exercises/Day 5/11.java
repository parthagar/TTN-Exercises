import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Exercise_5_11 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(list.stream().map(e -> e * 2 ).collect(Collectors.averagingInt(e -> e)));

    }
}
