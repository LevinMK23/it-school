package lesson4;

import java.util.Arrays;

public class FlattenArray {

    public static int[] flattenAndSort(int[][] array) {
        return Arrays.stream(array)
                .flatMapToInt(Arrays::stream)
                .sorted()
                .toArray();
    }

    public static void main(String[] args) {
        int[] res = flattenAndSort(new int[][]{
                {3, 2, 1},
                {},
                {4, 7, 5},
                {6, 8}
        });
        for (int i : res) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
