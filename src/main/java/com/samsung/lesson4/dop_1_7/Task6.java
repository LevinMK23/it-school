package com.samsung.lesson4.dop_1_7;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int right = x % 10, left;
        x /= 10;
        //
        while (x > 0) {
            left = x % 10;
            if (right == left) {
                System.out.println("YES");
                return;
            }
            right = left;
            x /= 10;
        }
        System.out.println("NO");
    }
}
