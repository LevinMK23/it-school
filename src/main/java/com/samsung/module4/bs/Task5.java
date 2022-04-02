package com.samsung.module4.bs;

import java.util.Scanner;

public class Task5 {

    private static double f(int a, int b, int c, int d, double x) {
        return a * x * x * x + b * x * x + c * x + d;
    }

    private static double solve(int a, int b, int c, int d) {
        double l = -1e9, r = 1e9;
        double eps = 1e-6;
        if (a > 0) {
            while (r - l > eps) {
                double mid = (r + l) / 2;
                if (f(a, b, c, d, mid) > 0) {
                    r = mid;
                } else {
                    l = mid;
                }
            }
        } else {
            while (r - l > eps) {
                double mid = (r + l) / 2;
                if (f(a, b, c, d, mid) < 0) {
                    r = mid;
                } else {
                    l = mid;
                }
            }
        }

        return l;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt(), d = in.nextInt();
        System.out.println(solve(a, b, c, d));
    }
}
