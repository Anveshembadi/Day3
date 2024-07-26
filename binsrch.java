
import java.util.Arrays;

public class binsrch {

    public static int binarySearch(int arr[], int l, int r, int x) {
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr[m] == x) {
                return m;
            }
            if (arr[m] < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 45, 454, 48, 78, 25, 96, 25 };
        Arrays.sort(arr);
        int l = 0;
        int r = arr.length;
        int x = 25;
        System.out.println(binarySearch(arr, l, r, x));
    }

}
