import java.util.*;

class Exercise_4_6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];
        Map<Integer, Integer> arraymap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

            if (arraymap.containsKey(arr[i]))
                arraymap.put(arr[i], arraymap.get(arr[i]) + 1);
            else
                arraymap.put(arr[i], 1);

        }

        ArrayList entryList= new ArrayList(arraymap.entrySet());

        Collections.sort(entryList, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                if(o1.getValue() <= o2.getValue())
                    return 1;
                else
                    return -1;
            }
        });

        System.out.println(entryList);
    }
}
