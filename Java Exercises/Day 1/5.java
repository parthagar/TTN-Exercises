import java.util.ArrayList;
import java.util.Scanner;

class Exercise_5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the sizes of the array (n1, n2):");
        int n1 = sc.nextInt(), n2 = sc.nextInt();

        int arr1[] = new int[n1], arr2[] = new int[n2];
        ArrayList<Integer> commonele = new ArrayList<>();

        System.out.println("Enter first array: ");
        for (int i = 0; i < n1; i++)
            arr1[i] = sc.nextInt();

        System.out.println("Enter second array: ");
        for (int i = 0; i < n2; i++)
            arr2[i] = sc.nextInt();

        for (int i = 0; i < n1; i++){
            for (int j = 0; j < n2; j++){
                if (arr1[i] == arr2[j]){

                    if (!commonele.contains(arr1[i]))
                        commonele.add(arr1[i]);
                }
            }
        }

        if (commonele.size() > 0)
            for (int i = 0; i < commonele.size(); i++){
                System.out.print(commonele.get(i) + " ");
            }
    }
}
