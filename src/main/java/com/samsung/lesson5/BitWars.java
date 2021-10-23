package com.samsung.lesson5;

public class BitWars {

    static String ODDS = "odds win";
    static String EVENS = "evens win";
    static String TIE = "tie";

    private static int countOfZero(int n) {
        if (n < 0) {
            n = -n;
            int cnt = 0;
            while (n > 0) {
                cnt += n % 2;
                n /= 2;
            }
            return -cnt;
        } else {
            int cnt = 0;
            while (n > 0) {
                cnt += n % 2;
                n /= 2;
            }
            return cnt;
        }
    }

    public static String bitsWar(int[] numbers) {
        int even = 0, odd = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                even += countOfZero(number);
            } else {
                odd += countOfZero(number);
            }
        }
        if (even > odd) {
            return EVENS;
        } else if (odd > even) {
            return ODDS;
        } else {
            return TIE;
        }
    }
}
