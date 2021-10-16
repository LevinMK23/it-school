package com.samsung.lesson4;

import java.util.Scanner;

public class Task10 {

    public static boolean isPrime(int n) {
        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if (isPrime(x)) {
            System.out.println("prime");
        } else {
            System.out.println("composite");
        }
    }
}
