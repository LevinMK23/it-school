package com.samsung.lesson2;

import java.util.Scanner;

public class Point1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble(), y = in.nextDouble();
        if (x * x + y * y >= 4 && x <= 2 && y <= x && y >= 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
