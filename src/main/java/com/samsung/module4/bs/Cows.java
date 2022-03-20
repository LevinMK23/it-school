package com.samsung.module4.bs;

import java.util.Arrays;
import java.util.Scanner;

public class Cows {

    public static boolean can(int[] c, int k, long dis) {
        k--;
        int pos = 1, prev = c[0];
        while (k > 0) {
            if (c[pos] - prev > dis) {
                k--;
                if (k == 0) {
                    return true;
                }
                prev = c[pos];
            }
            pos++;
            if (pos == c.length) {
                return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), k = in.nextInt();
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = in.nextInt();
        }
        Arrays.sort(c);
        long l = 0, r = c[c.length - 1];
        while (r - l > 1) {
            long mid = (l + r) / 2;
            if (can(c, k, mid)) {
                l = mid;
            } else {
                r = mid;
            }
        }
        System.out.println(r);
    }
}
