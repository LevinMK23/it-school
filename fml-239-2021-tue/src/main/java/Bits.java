public class Bits {
    public static void main(String[] args) {
        int x = 12;
        int y = -x;
        System.out.println(Integer.toBinaryString(x));
        System.out.println(Integer.toBinaryString(y));
        x = x << 1;
        // x << i -> x * 2 ** i
        System.out.println(Integer.toBinaryString(x));
        x = x >> 1; // x / 2 ** i
        System.out.println(Integer.toBinaryString(x));

        x = 0b11001001;
        y = 0b01011011;
        System.out.println(Integer.toBinaryString(x & y));
        System.out.println(Integer.toBinaryString(x | y));
    }
}
