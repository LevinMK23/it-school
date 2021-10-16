package com.samsung.lesson4.dop_1_7;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int cur = 2;
        for (int i = 0; i < n; i++) {
            System.out.print(cur + " ");
            cur += 2;
        }
        System.out.println();
    }
}
