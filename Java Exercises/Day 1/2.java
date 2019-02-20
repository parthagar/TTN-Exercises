import java.util.Scanner;

class Exercise_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String[] words = str.split(" ");
        int[] count = new int[words.length];

        System.out.println("Number of duplicate words in the string are: ");

        for (int i = 0; i < words.length - 1; i++) {

            count[i] = 1;

            for (int j = i + 1; j < words.length; j++) {

                if (count[i] == -1)
                    break;

                if (count[j] == -1)
                    continue;

                if (words[i].equals(words[j])) {
                    count[i]++;
                    count[j] = -1;
                }
            }

            if (count[i] > 1)
                System.out.println(words[i] + ": " + count[i]);
        }
    }
}
