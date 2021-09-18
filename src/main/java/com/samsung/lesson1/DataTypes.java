package com.samsung.lesson1;

public class DataTypes {

    public static void main(String[] args) {
        // примитивные типы
        byte b = 127; // 1b [-2^7; 2^7)
        short sh = -32_768; // 2b
        int i = 2_000_000_000;
        long l = 9_000_000_000_000_000_000L;
        long bill = 1234_1245_1111_7778L;

        float f = 1 / 3f;
        double d = 1 / 3.;

        char c = '$';
        boolean boo = true;



        String s = "Hello " + "world";

        System.out.printf("%.17f\n", f);
        System.out.printf("%.17f\n", d);

    }
}
