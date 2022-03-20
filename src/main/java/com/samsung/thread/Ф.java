package com.samsung.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ф {

    // O(N**2)

    // O(N)
    static List<String> func(List<String> words) {
        Map<String, Integer> map = words.stream()
                .collect(
                        Collectors.toMap(
                                Function.identity(),
                                v -> 1,
                                Integer::sum
                        )
                );
        List<String> res = new ArrayList<>();
        for (String word : words) {
            if (map.get(word) % 2 == 1) {
                res.add(word);
            }
        }
        return res;
    }

    static int myfunc(int[] a) {
        if (a[0] != a[a.length - 1]) {
            return a.length - 2;
        }
        int i = 0;
        int j = a.length - 1;
        while (a[i] != a[j]) {
            i++;
        }
        int d1 = j - i - 2;
        while (a[i] != a[j]) {
            j--;
        }
        int d2 = j - i - 2;
        return Math.max(d2, d1);
    }

    static int[] getRandom() {
        return IntStream.generate(() -> ((int) (Math.random() * 10)))
                .limit(10)
                .toArray();
    }

    public static void main(String[] args) {
        int[] random = getRandom();
        for (int i : random) {
            System.out.print(i + " ");
        }
        System.out.println();
        int myfunc = myfunc(new int[]{1, 1, 2, 3, 1, 1, 1, 1, 1, 1});
        System.out.println(myfunc);
    }

}
