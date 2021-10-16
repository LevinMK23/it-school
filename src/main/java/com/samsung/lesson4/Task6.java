package com.samsung.lesson4;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        // a0 = 26
        // sn = ((a0 + an) * n) / 2
        // O(1)
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a0 = 26;
        if (n < 26) {
            System.out.println(0);
            return;
        }
        if (n % 2 == 1) {
            n--;
        }
        long cnt = (n - a0) / 2 + 1;
        long result = ((a0 + n) * cnt) / 2;
        System.out.println(result);
    }
}
