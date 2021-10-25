package lesson5.test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), zeroes = 0;
        for (int i = 0; i < n; i++) {
            int cur = in.nextInt();
            if (cur != 0) {
                System.out.print(cur + " ");
            } else {
                zeroes++;
            }
        }
        for (int i = 0; i < zeroes; i++) {
            System.out.print(0 + " ");
        }
    }
}
