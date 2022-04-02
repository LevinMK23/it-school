package com.samsung.module4.bs;

import java.util.Scanner;

public class Task2V1 {

    private static int bsLeft(int[] a, int key) {

        int l = -1;
        int r = a.length;

        boolean isExist = false;

        while (r - l > 1) {
            int mid = (l + r) / 2;
            if (a[mid] < key) {
                l = mid;
            } else {
                if (a[mid] == key) {
                    isExist = true;
                }
                r = mid;
            }
        }

        return isExist ?  r + 1 : 0;
    }

    private static int bsRight(int[] a, int key) {

        int l = -1;
        int r = a.length;

        boolean isExist = false;


        while (r - l > 1) {
            int mid = (l + r) / 2;
            if (a[mid] <= key) {
                if (a[mid] == key) {
                    isExist = true;
                }
                l = mid;
            } else {
                r = mid;
            }
        }

        return isExist ? l + 1 : 0;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), q = in.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        for (int i = 0; i < q; i++) {
            int cur = in.nextInt();
            if (bsLeft(a, cur) == 0) {
                System.out.println(0);
            } else {
                System.out.println(bsLeft(a, cur) + " " + bsRight(a, cur));
            }
        }
    }
}
