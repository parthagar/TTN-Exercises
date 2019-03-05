import java.util.Scanner;

class Exercise_2_2{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        char[] charArray = str.toCharArray();
        char temp;

        for (int i = 0; i < charArray.length - 1; i++){
            for (int j = i + 1; j < charArray.length; j++){
                if (charArray[i] > charArray[j])
                {
                   temp = charArray[i];
                   charArray[i] = charArray[j];
                   charArray[j] = temp;
                }
            }
        }

        System.out.println(charArray);

    }
}