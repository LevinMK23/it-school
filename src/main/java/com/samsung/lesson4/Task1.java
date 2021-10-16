package com.samsung.lesson4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cnt = 0;
        while (true) {
            int cur = in.nextInt();
            cnt++;
            if (cur < 0) {
                break;
            }
        }
        System.out.println(cnt);
    }
}
