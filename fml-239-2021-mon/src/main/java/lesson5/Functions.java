package lesson5;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Comparator;

public class Functions {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(Integer... args) {
        int sum = 0;
        for (Integer arg : args) {
            sum += arg;
        }
        return sum;
    }

    public static void print(int n) {

        if (n == 0) {
            return;
        }

        print(n - 1);
        System.out.print(n + " ");
    }

    public static void change(Integer[] array, int value) {
        array[0] = value;
    }

    public static void change(int cur, int value) {
        cur = value;
    }

    public static void main(String[] args) {
        System.out.println(sum(1, 2, 3));
        print(5);
        System.out.println();
        int cur = 5;
        Integer[] array = {1, 2, 3, 4, 5};
        change(cur, 7);
        change(array, 7);
        Arrays.sort(array, Functions::cmp);
        System.out.println(cur);
        System.out.println(Arrays.toString(array));

        byte[] data = "Hello".getBytes(StandardCharsets.UTF_8);
        System.out.println(Arrays.toString(data));
        data = "Привет".getBytes(StandardCharsets.UTF_8);
        System.out.println(Arrays.toString(data));
        int f, b = 10;
        float a[] = new float[10];
        for (double i: a)
            System.out.print(i + " ");
    }

    public static Integer cmp(Integer o1, Integer o2) {
        return o2 - o1;
    }

}
