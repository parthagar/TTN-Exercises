import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Exercise_4_2 {

    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";

        System.out.println(str.toCharArray());
        Set<Character> unique = new HashSet<>();

        for (Character c : str.toCharArray()){
            unique.add(c);
        }

        System.out.println(unique);


    }
}
