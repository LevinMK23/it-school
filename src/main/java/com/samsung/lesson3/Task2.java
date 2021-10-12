package com.samsung.lesson3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        // n = 3 ()(())((()))
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        // ()(())
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("(");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(")");
            }
        }
        System.out.println();
    }
}
