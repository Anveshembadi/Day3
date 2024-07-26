import java.util.ArrayList;
import java.util.PriorityQueue;

public class maxItems {
    public int maxpurchase(ArrayList<Integer> al, int money) {
        int count = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(al);
        while (pq.isEmpty() == false && money >= pq.peek()) {
            money = money - pq.poll();
            count += 1;
        }
        return count;
    }

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        int n = 10;
        for (int i = 0; i < n; i++) {
            al.add((i * 2) + 3);
        }
        int money = 50;
        maxItems mi = new maxItems();
        System.out.println(mi.maxpurchase(al, money));
    }
}
