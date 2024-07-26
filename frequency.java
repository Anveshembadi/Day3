import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class frequency {
    public static void freq(ArrayList<Integer> al) {
        Map<Integer, Integer> m = new LinkedHashMap<>();
        int count = 1;
        for (int i = 0; i < al.size(); i++) {
            if (m.containsKey(al.get(i)) == true) {
                m.put(al.get(i), m.get(al.get(i)) + 1);

            } else {
                m.put(al.get(i), count);
            }
        }
        // ArrayList arl = new ArrayList<>();
        for (Map.Entry<Integer, Integer> y : m.entrySet()) {
            System.out.println(y.getKey() + " --> " + y.getValue());
        }

    }

    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of list");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            ar.add(sc.nextInt());
        }
        freq(ar);
    }
}
