import java.util.Scanner;

class Exercise_4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        char[] chars = str.toCharArray();
        
        int lowcase = 0, uppcase = 0, digits = 0, spechars = 0;

        for (int i = 0; i < chars.length; i++){

            if(Character.isLowerCase(chars[i]))
                lowcase++;

            else if(Character.isUpperCase(chars[i]))
                uppcase++;

            else if(Character.isDigit(chars[i]))
                digits++;

            else
                spechars++;

        }

        System.out.println("Percentage of characters");
        System.out.println("Lowercase: " + (lowcase * 100.0 / chars.length) +
                           "%\nUppercase: " + (uppcase * 100.0 / chars.length) +
                           "%\nDigit: " + (digits * 100.0 / chars.length) +
                           "%\nSpecial Characters: " + (spechars * 100.0 / chars.length) + "%");

    }
}
