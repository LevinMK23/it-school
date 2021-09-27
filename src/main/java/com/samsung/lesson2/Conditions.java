package com.samsung.lesson2;

import java.util.Scanner;

public class Conditions {

    public static void main(String[] args) {
//        int x = 1, y = 1;
//
//        if (x > 5 & y-- < 0) {
//
//        }
//        System.out.println(y);
//
//        if (x > 5 && y-- < 0) {
//
//        }
//        System.out.println(y);

        // ==, !=, >, >=, <, <=
        // &&, ||, ^, !

        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
        int x = in.nextInt();



        if (x < a) {
            System.out.printf("х принадлежит отрезку (-∞; %d)\n", a);
        } else if (x < b) {
            System.out.printf("x принадлежит отрезку [%d; %d)\n", a, b);
        } else if (x < c) {
            System.out.printf("x принадлежит отрезку [%d; %d)\n", b, c);
        } else {
            System.out.printf("х принадлежит отрезку [%d; +∞)\n", c);
        }

        if (x < a) {

        }

        if (x >= a && x < b) {

        }

        if (x >= b && x < c) {

        }

        if (x >= c) {

        }



    }
}
