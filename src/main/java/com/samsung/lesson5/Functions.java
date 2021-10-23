package com.samsung.lesson5;

public class Functions {

    public static void f(int n) {
        if (n <= 0) {
            return;
        }
        f(n - 1);
        System.out.println(n);
    }

    // 1 1 2 3 5 8 13 21

    static long[] mem = new long[51];

    public static long fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        if (mem[n] != 0) {
            return mem[n];
        }
        mem[n] = fib(n - 1) + fib(n - 2);
        return mem[n];
    }

    public static int foo(int a, int b) {
        return a + b;
    }

    public static void bar(String world) {
        System.out.println("Hello " + world);
    }

    public static void main(String[] args) {
        System.out.println(fib(50));
    }

}
