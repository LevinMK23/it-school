package com.samsung.lesson4.dop_1_7;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt(),
                c = in.nextInt(), d = in.nextInt(),
        cnt = 0;
        for (int i = 10000; i < 100000; i++) {
            if (i % a == b && i % c == d) {
                System.out.print(i + " ");
                cnt++;
            }
        }
        if (cnt == 0) {
            System.out.println(-1);
        }
    }
}
