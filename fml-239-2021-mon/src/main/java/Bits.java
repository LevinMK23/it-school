public class Bits {

    public static void main(String[] args) {

        // 2, 8, 10, 16
        int bin = 0b1100; // 12
        int oct = 010;    // 8
        int hex = 0xff;   // 255

        // >> << & | ^ ~
        System.out.println(bin >> 1);
        System.out.println(bin << 1);

        //         |
        int a = 0b1001100;
        //      0b0100000 (1 << (i - 1))) | x - установит 1 для бита с номером i
        int b = 0b1100110;
        // 00000000
        //        1
        // 11111111
        // 00010000 -> (-1 - (1 << (i - 1))) & x - установит 0 для бита с номером i

        System.out.println(Integer.toBinaryString(a & b));
        System.out.println(Integer.toBinaryString(a | b));
        System.out.println(Integer.toBinaryString(-1));

//        // 1 2 3 1 2 3 4 5 6 6 5
//        // 1100
//        // 1100
//        // 0000
//        // 1100
//        int x = 0, tmp;
//        for (int i = 0; i < 11; i++) {
//            tmp = in.nextInt();
//            x = x ^ tmp;
//        }
//        System.out.println(x);

        int x = 5;
        // 00000101
        // 11111010
        // 11111111
        //        1
        // 00000000
        // -x = ~x + 1
        System.out.println(~x + 1);

    }
}
