package com.samsung.lesson5;

import com.samsung.module2.lesson1.Point;

import java.util.Arrays;

public class AreSame {

    private static void makePositive(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = -array[i];
            }
        }
    }

    public static boolean comp(int[] a, int[] b) {
        if (checkSize(a, b)) {
            makePositive(a);
            makePositive(b);
            Arrays.sort(a);
            Arrays.sort(b);
            for (int i = 0; i < a.length; i++) {
                if (a[i] * a[i] != b[i]) {
                    return false;
                }
            }
        } else {
            return false;
        }
        return true;
    }

    private static boolean checkSize(int[] a, int[] b) {
        if (a == b) {
            return true;
        }
        if (a == null || b == null) {
            return false;
        }
        return a.length == b.length;
    }

    public static void main(String[] args) {
        Point p = new Point(1, 2);
    }
}
