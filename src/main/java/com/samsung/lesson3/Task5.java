package com.samsung.lesson3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        // 1 2 3 5 4 4 4 4 4 5 5 7 6
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        // 1 2 3 4 5
        // 1 1 1
        // 1 1 2 2 3 3 3
        int length = 1, maxLength = 0, tmp = 0;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] == a[i + 1]) {
                length++;
                if (i == n - 2) {
                    if (length > maxLength) {
                        maxLength = length;
                        tmp = a[i];
                    }
                }
            } else {
                if (length > maxLength) {
                    maxLength = length;
                    tmp = a[i];
                }
                length = 1;
            }
        }
        System.out.println("Item = " + tmp);
        System.out.println("Length = " + maxLength);
    }
}
