package com.samsung.lesson4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        while (true) {
            int cur = in.nextInt();
            if (cur > 9 && cur < 100) {
                sum += cur / 10 + cur % 10;
            } else {
                break;
            }
        }
        System.out.println(sum);
    }
}
