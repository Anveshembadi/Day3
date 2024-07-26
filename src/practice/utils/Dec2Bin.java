package practice.utils;

import java.util.Scanner;

public class Dec2Bin {
    public static void tobin(int n) {
        int[] binary = new int[1000];
        int i = 0;

        while (n > 0) {
            binary[i] = n % 2;
            n = n / 2;
            i++;

        }
        for (int j = i; j >= 0; j--) {
            System.out.print(binary[j]);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        tobin(n);
    }
}
