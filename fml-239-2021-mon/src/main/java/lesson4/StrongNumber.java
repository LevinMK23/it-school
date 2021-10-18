package lesson4;

public class StrongNumber {

    private static String STRONG = "STRONG!!!!";
    private static String NOT_STRONG = "Not Strong !!";

    public static String isStrongNumber(int num) {
        int tmp = num;
        long sum = 0;
        //
        while (tmp > 0) {
            int digit = tmp % 10;
            sum += factor(digit);
            tmp /= 10;
        }
        if (sum == num) {
            return STRONG;
        }
        return NOT_STRONG;
    }

    public static long factor(int n) {
        long mul = 1;
        for (int i = 2; i <= n; i++) {
            mul *= i;
        }
        return mul;
    }

    public static void main(String[] args) {
        System.out.println(isStrongNumber(145));
    }
}
