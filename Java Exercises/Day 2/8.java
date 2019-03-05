import java.util.Scanner;

class Exercise_2_8_1 {

    public static void main(String[] args) {

        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("While loop");

        while(!(str = sc.nextLine()).equals("done")){

            System.out.print("The first and last letters are ");

            if(str.charAt(0) == str.charAt(str.length() - 1))
                System.out.println("equal");
            else
                System.out.println("not equal");
        }

    }
}

class Exercise_2_8_2 {

    public static void main(String[] args) {

        String str = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Do - While loop");


        do {
            if (!(str.isEmpty())) {
                System.out.print("The first and last letters are ");

                if (str.charAt(0) == str.charAt(str.length() - 1))
                    System.out.println("equal");
                else
                    System.out.println("not equal");
            }

            str = sc.nextLine();

        }while(!(str.equals("done")));
    }
}