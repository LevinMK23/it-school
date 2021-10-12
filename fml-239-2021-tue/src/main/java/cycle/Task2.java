package cycle;

import java.util.Scanner;

public class Task2 {
    // [1 2 3 4 5] 1 2 3 1 1 1 2
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int maxLen1 = 0, len1 = 1, len2 = 1, maxLen2 = 0;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] < a[i + 1]) {
                len1++;
                if (i == n - 2) {
                    if (len1 > maxLen1) {
                        maxLen1 = len1;
                    }
                }
            } else {
                if (len1 > maxLen1) {
                    maxLen1 = len1;
                }
                len1 = 1;
            }
            if (a[i] > a[i + 1]) {
                len2++;
                if (i == n - 2) {
                    if (len2 > maxLen2) {
                        maxLen2 = len2;
                    }
                }
            } else {
                if (len2 > maxLen2) {
                    maxLen2 = len2;
                }
                len2 = 1;
            }
        }

        System.out.println(Math.max(maxLen1, maxLen2));
    }
}
