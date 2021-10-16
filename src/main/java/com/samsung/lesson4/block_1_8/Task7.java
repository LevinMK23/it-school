package com.samsung.lesson4.block_1_8;

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
            if (a[i] < 0) {
                System.out.print(a[i] + " ");
            }
        }
        for (int i = 0; i < n; i++) {
            if (a[i] >= 0) {
                System.out.print(a[i] + " ");
            }
        }
        System.out.println();
    }
}
