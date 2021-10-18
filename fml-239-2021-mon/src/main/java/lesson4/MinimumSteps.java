package lesson4;

import java.util.Arrays;

public class MinimumSteps {
    public static int minimumSteps(int[] numbers, int k) {
        Arrays.sort(numbers);
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            if (sum >= k) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] a = {4, 1, 2, 3, 5, 7};
        int k = 12;
        System.out.println(minimumSteps(a, k));
    }
}
