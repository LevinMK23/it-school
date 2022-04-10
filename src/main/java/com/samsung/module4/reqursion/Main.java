package com.samsung.module4.reqursion;

import com.samsung.module4.bst.Bst;

import java.io.File;
import java.util.TreeSet;

public class Main {

    static void print(int n) {

        if (n == 0) {
            return;
        }

        print(n - 1);

        // System.out.println(n);
    }

    static void showCatalog(File dir, String prefix) {

        File[] files = dir.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    System.out.println(prefix + file.getName());
                } else {
                    System.out.println(prefix + file.getName());
                    showCatalog(file, prefix + "-");
                }
            }
        }

    }

    static long factor(long n) {
        return n <= 1 ? 1 : n * factor(n - 1);
    }

    static long[] cache = new long[100];

    // 0 1 1 2 3 5 8 13 21 34 55..
    static long fib(int n) {
        System.out.print("*");
        if (cache[n] != 0) {
            return cache[n];
        }
        cache[n] = n == 0 || n == 1 ? n : fib(n - 1) + fib(n - 2);
        return cache[n];
    }

    static long[][] cnk = new long[100][100];

    static long cnk(int n, int k) {
        if (n < 0 || k < 0 || k > n) {
            return 0;
        }
        if (cnk[n][k] != 0) {
            return cnk[n][k];
        }
        if (n == 1 || k == 1 || n == k) {
            cnk[n][k] = 1;
            return 1;
        }
        cnk[n][k] = cnk(n - 1, k) + cnk(n - 1, k - 1);
        return cnk[n][k];
    }

    public static void main(String[] args) {
        File dir = new File("src/main/java/com/samsung");
        //showCatalog(dir, "");
        System.out.println(factor(5));
        System.out.println(fib(10));

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(cnk(i, j) + " ");
            }
            System.out.println();
        }

        Bst tree = new Bst();

        tree.add(5);
        tree.add(2);
        tree.add(1);
        tree.add(3);
        tree.add(7);
        tree.add(6);
        tree.add(8);

       // tree.print();

//        for (Integer value : tree) {
//            System.out.println(value);
//        }

        int[] a = {1, 7, 12, 9, 34};

        TreeSet<Integer> set = new TreeSet<>();

        for (int i : a) {
            set.add(i);
        }

        System.out.println(set.first());
        System.out.println(set.last());
        System.out.println(set.ceiling(8));
        System.out.println(set.floor(8));
    }
}
