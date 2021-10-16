package com.samsung.lesson4;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        while (x > 0) {
            int cur = x % 10;
            if (cur % 2 == 1) {
                System.out.println(cur);
                return;
            }
            x /= 10;
        }
        System.out.println("NO");
    }
}
