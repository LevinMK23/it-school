package com.samsung.lesson4.block_1_8;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), cnt, max = 0, val = 0;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int cur = a[i];
            cnt = 0;
            for (int j = 0; j < n; j++) {
                if (cur == a[j]) {
                    cnt++;
                    if (cnt > max) {
                        max = cnt;
                        val = cur;
                    }
                }
            }
        }
        System.out.println(val);
    }
}
