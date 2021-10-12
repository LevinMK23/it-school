package com.samsung.lesson3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        // количество цифр, сумму цифр
        int sum = 0, cnt = 0;
        //
        while (n > 0) {
            sum += n % 10;
            cnt++;
            n /= 10;
        }
        System.out.println("Sum = " + sum);
        System.out.println("Length = " + cnt);
    }
}
