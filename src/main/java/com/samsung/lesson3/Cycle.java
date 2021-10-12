package com.samsung.lesson3;

import java.util.Scanner;

public class Cycle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int cnt = 0;
        while (cnt < n) {
            System.out.print(" * ");
            cnt++;
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.print(" * ");
        }
        System.out.println();

    }
}
