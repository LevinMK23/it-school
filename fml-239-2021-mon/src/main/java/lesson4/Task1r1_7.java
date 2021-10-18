package lesson4;

import java.util.Scanner;

public class Task1r1_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        while (true) {
            int cur = in.nextInt();
            if (cur > 10) {
                sum += cur;
            }
            if (cur % 5 == 0) {
                break;
            }
        }
        System.out.println(sum);
    }
}
