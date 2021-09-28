public class Main {

    public static void main(String[] args) {
        // Output in java
        System.out.println("Hello world");
        int x = 3, y = 4;
        System.out.println(x + " " + y);

        // %d - int, %f - float, %c - char, %s - String
        System.out.printf("%d %d\n", x, y);

        // cmd + option + l
        // ctrl alt l
        int days = 15;
        int ill = 14;
        System.out.printf("Иван в этом месяце отработал %d дней, " +
                "а %d дней он провел на больничном\n", days, ill);

        x = 1;
        System.out.printf("%02d\n", x);

        // data types
        // byte 1b, short 2b, int 4b (1234), long 8b (1000_2000_3000_4000L)
        // float 4b (1.34f), double 8b (1.34, 1.)
        // char 2b ('a', '1', '!', '\'')
        // boolean (true, false)

        x = 0b1100;
        System.out.println(x);
        x = 010;
        System.out.println(x);
        x = 0xff;
        System.out.println(x);

        //arithmetic
        // + - * / % (| & ~ ^ >> <<)

        int a = 5, b = 2; // 2 1/2
        System.out.println(a / b + " " + a % b);

        double a1 = 5, b1 = 3;
        System.out.println(a1 / b1 + " " + a1 % b1);


    }
}
