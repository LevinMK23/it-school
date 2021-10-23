package com.samsung.lesson5;

import java.util.Arrays;

public class CreatePhoneNumber {

    static int foo(int... params) {
        return Arrays.stream(params).sum();
    }

    public static String createPhoneNumber(int[] numbers) {
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d", Arrays.stream(numbers).boxed().toArray());
    }

    public static void main(String[] args) {
        System.out.println(createPhoneNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));

        foo(1);
        foo(1, 2, 3, 4, 5);
    }
}
