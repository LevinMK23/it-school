package com.samsung.lesson4;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int min = 9;
        while (x > 0) {
            int cur = x % 10;
            if (cur > 0) {
                if (cur < min) {
                    min = cur;
                }
            }
            x /= 10;
        }
        System.out.println(min);
    }
}
