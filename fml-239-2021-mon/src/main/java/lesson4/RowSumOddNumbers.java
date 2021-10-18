package lesson4;

import java.util.Scanner;

class RowSumOddNumbers {

    public static int rowSumOddNumbers(int n) {
        int cnt = 0, step = 1;
        for(int i = 0; i < n; i++) {
            cnt += step;
            step++;
        }
        // cnt - количество чисел в пирамиде из n строк
        // step - количество цифр в n + 1 строке
        step--;
        // last - нижний правый элемент пирамиды из n строк
        int last = 1 + 2 * (cnt - 1);
        int sum = 0;
        // 7 9 11 (last)
        // step = 3
        for(int i = 0; i < step; i++) {
            sum += last;
            last -= 2;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(rowSumOddNumbers(n));
    }
}