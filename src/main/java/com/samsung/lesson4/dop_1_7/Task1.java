package com.samsung.lesson4.dop_1_7;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int height = 437;
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            int currentHeight = in.nextInt();
            if (currentHeight < height) {
                System.out.println("Crash " + i);
                return;
            }
        }
        System.out.println("No crash");
    }
}
