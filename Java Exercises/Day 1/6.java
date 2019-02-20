import java.util.Scanner;

class Exercise_6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] count = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        for (int i = 0; i < n; i++) {

            int flag = 0;

            for (int j = 0; j < n; j++) {
                if (i != j && arr[i] == arr[j]) {
                    flag = 1;
                    break;
                }
            }

            if (flag == 0) {
                System.out.println("The element having single occurrence: " + arr[i]);
                break;
            }
        }


    }
}
