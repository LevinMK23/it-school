package cycle;

import java.util.Scanner;

public class ArraysExample {
    // 2 3 4 5 1 2 3 4 4 4 4 4 6 6 7 7 7 8 -> 4 5
    // 2 2 2 3 3 3 4 4 4 -> 2 3
    // 1 2 3 4 5 -> 1 1
    // 1 1 1 1 1 -> 1 5
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        // 1 1 1 1 2 3 4 5 5 5 5
        int value = 0, length = 1, maxLength = 0;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] == a[i + 1]) {
                length++;
                if (i == n - 2) {
                    if (length > maxLength) {
                        maxLength = length;
                        value = a[i];
                    }
                }
            } else {
                if (length > maxLength) {
                    maxLength = length;
                    value = a[i];
                }
                length = 1;
            }
        }
        System.out.println(value + " " + maxLength);
    }
}
