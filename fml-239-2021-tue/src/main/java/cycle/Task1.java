package cycle;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        for (int i = 1; i < a + 1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("(");
            }
            for (int b = 0; b < i; b++) {
                System.out.print(")");
            }
        }
        System.out.println();
    }

}
