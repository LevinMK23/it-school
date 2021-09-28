import java.util.Scanner;

public class Main {
    // psvm
    public static void main(String[] args) {
        // sout
        System.out.println("Hello world");

        // целые числа
        // byte, short, int, long
        // 00000100

        int a = 3, b = 5;

        System.out.println(a + " + " + b + " = " + (a + b));
        // %d - int, %f - float, %c - char, %s - string
        System.out.printf("%d - %d = %d\n", a, b, a - b);
        System.out.printf("%d * %d = %d\n", a, b, a * b);
        System.out.printf("%d / %d = %d\n", b, a, b / a);
        System.out.printf("%d %% %d = %d\n", b, a, b % a);

        // дробные числа
        // float, double
        // float - 8 знаков
        // double - 16 знаков

        float f = 1.34f;
        double d = 1.34;
        System.out.printf("%.16f\n", 1f / 3);
        System.out.printf("%.16f\n", 1. / 3);

        char c = 'a';

        boolean boo = true;

        // input

        Scanner in = new Scanner(System.in);

        int x = in.nextInt(), y = in.nextInt();

        System.out.printf("%d + %d = %d\n", x, y, x + y);
    }
}
