package com.samsung.lesson5;

import java.util.Arrays;

public class NumberZooPatrol {

    public static int findMissingNumber(int[] numbers) {
        int sum = Arrays.stream(numbers).sum();
        long sumAll = (long)(2 + numbers.length) * (numbers.length + 1) / 2;
        return (int) (sumAll - sum);
    }

}
