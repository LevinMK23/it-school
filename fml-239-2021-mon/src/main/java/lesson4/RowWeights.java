package lesson4;

import java.util.Arrays;

public class RowWeights {

    public static int[] rowWeights(final int[] weights) {
        int[] result = new int[2];
        for (int i = 0; i < weights.length; i++) {
            result[i % 2] += weights[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] res = rowWeights(new int[]{13, 27, 49});
        System.out.println(Arrays.toString(res));
    }
}
