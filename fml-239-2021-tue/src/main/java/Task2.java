import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // x - (-1B, 1B), i - (1, 31)
        int x = in.nextInt(), i = in.nextInt();
        // Для числа Х установить значение i-ого бита в 0
        // 0000000000000
        //           321
        //      |
        // 00001100
        // 11111111
        //-00000100
        // 11111011 (-1 - (1 << (i - 1))) & x
        // 00001100 &
        // 00001000
    }
}
