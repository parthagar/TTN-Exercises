import java.util.Scanner;

class Exercise_2_7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of seconds: ");
        long seconds = sc.nextLong();

        long minutes = seconds / 60;
        seconds = seconds % 60;

        long hours = minutes / 60;
        minutes = minutes % 60;

        long days = hours / 24;
        hours = hours % 24;

        System.out.println("Days: " + days + " Hours: " + hours + " Minutes: " + minutes + " Seconds:" + seconds);

    }
}
