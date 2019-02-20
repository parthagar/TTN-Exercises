import java.util.Scanner;

class Exercise_8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string: ");
        StringBuffer str = new StringBuffer(sc.nextLine());

        str = str.reverse().delete(4, 9);

        System.out.println("Formatted string is: \n" + str);
    }
}
