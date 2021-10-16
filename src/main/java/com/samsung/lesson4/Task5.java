package com.samsung.lesson4;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int cnt = 0;
        while (x > 0) {
            x /= 10;
            cnt++;
        }
        System.out.println(cnt);
    }
}
