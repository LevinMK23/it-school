package cycle;

import java.util.Scanner;

public class Task1_1 {
    // ()(())((()))(((()))).......
    // первые N скобок
    // n = 5 -> ()(()
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int cnt = 1;
        l:
        while (n > 0) {
            for (int i = 0; i < cnt; i++) {
                System.out.print("(");
                n--;
                if (n == 0) {
                    break l;
                }
            }
            for (int i = 0; i < cnt; i++) {
                System.out.print(")");
                n--;
                if (n == 0) {
                    break;
                }
            }
            cnt++;
        }
        // break
        // return
    }
}
