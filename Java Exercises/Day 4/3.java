import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Exercise_4_3 {

    public static void main(String[] args) {

        HashMap<Character, Integer> countOccurence = new HashMap<Character, Integer>();

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        char[] chars = str.toCharArray();

        for (char c : chars){
            if(countOccurence.containsKey(c))
                countOccurence.put(c, countOccurence.get(c) + 1);
            else
                countOccurence.put(c, 1);
        }

        for (Map.Entry pair: countOccurence.entrySet()){
            System.out.println(pair.getKey() + ": " + pair.getValue());
        }
    }
}
