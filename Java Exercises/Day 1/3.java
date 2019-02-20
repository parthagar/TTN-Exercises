import java.util.Scanner;

class Exercise_3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char c = sc.next().charAt(0);

        int len_w_char = str.length();
        int len_wo_char = str.replace(Character.toString(c), "").length();

        int count = len_w_char - len_wo_char;

        System.out.println("Number of occurences of '" + c + "' in the string are: " + count);

    }
}
