package practise;

import java.util.Arrays;
import java.util.Scanner;

public class kLargeEle {
    public static int[] large(int[] arr, int k) {
        Arrays.sort(arr);
        int[] arr1 = new int[k];
        for (int i = 0; i < k; i++) {
            arr1[i] = arr[arr.length - 1 - i];
        }
        return arr1;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:");

        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the k value:");
        int k = sc.nextInt();
        int[] res = large(arr, k);
        System.out.println("the " + k + "large elemnts are :" + Arrays.toString(res));
    }
}
