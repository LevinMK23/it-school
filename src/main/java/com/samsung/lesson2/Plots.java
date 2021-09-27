package com.samsung.lesson2;

import java.util.Scanner;

public class Plots {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt(), y = in.nextInt();

        if (
            (y <= 0 && y >= x && y <= x * x - 4) ||
            (y >= 0 && y <= x * x - 4 && y <= x)
        ) {
            System.out.println("OK");
        } else {
            System.out.println("NO");
        }
    }
}
