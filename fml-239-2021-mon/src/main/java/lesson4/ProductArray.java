package lesson4;

public class ProductArray {

    public static long[] productArray(int[] numbers) {
        long[] result = new long[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            long mul = 1;
            for (int j = 0; j < numbers.length; j++) {
                if (i != j) {
                    mul *= numbers[j];
                }
            }
            result[i] = mul;
        }
        return result;
    }

    public static void main(String[] args) {
        long[] array = productArray(new int[]{1, 2, 3, 4});
        for (long l : array) {
            System.out.print(l + " ");
        }
        // 24 12 8 6
        System.out.println();
    }
}
