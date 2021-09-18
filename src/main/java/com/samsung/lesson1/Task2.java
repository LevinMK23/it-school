package com.samsung.lesson1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.next();
        for (int i = 0; i < line.length() / 2; i++) {
            if (line.charAt(i) != line.charAt(line.length() - i - 1)) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
