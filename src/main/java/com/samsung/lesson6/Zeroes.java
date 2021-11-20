package com.samsung.lesson6;

import java.util.Scanner;

public class Zeroes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int zeroes = 0;
        for (int i = 0; i < n; i++) {
            int cur = in.nextInt();
            if (cur == 0) {
                zeroes++;
            } else {
                System.out.print(cur + " ");
            }
        }
        for (int i = 0; i < zeroes; i++) {
            System.out.print(0 + " ");
        }
    }
}
