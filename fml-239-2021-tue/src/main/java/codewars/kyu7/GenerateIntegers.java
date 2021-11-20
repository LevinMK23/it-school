package codewars.kyu7;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GenerateIntegers {

    public static int[] generateIntegers(final int m, final int n) {
        // 2 5 -> 5 - 2 = 3
        // 2 3 4 5
        int length = n - m + 1;
        int[] array = new int[length];
        int start = m;
        for (int i = 0; i < length; i++) {
            array[i] = start;
            start++;
        }
        return array;
    }

    double r(int s, boolean w){
        double i = 5.0;
        return s;
    }

    void r(){
        int i = 5;
    }

    float r(int s){
        float i = 5f;
        return (int) i;
    }

    public static int[] generateIntegers2(final int m, final int n) {
        return IntStream.rangeClosed(m, n).toArray();
    }

    public static List<String> top3(String s) {
        s = s.toLowerCase();
        //
        s = s.replaceAll("[^a-z']", " ").trim();
        String[] words = s.split(" +");
        System.out.println(Arrays.toString(words));
        return Arrays.stream(words)
                .filter(word -> !word.matches("'+"))
                .filter(word -> !word.isEmpty())
                .collect(Collectors.toMap(
                        Function.identity(),
                        value -> 1,
                        Integer::sum
                ))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue((o1, o2) -> o2 - o1))
                .limit(3)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    private static int cmp(Integer left, Integer right) {
        return right - left;
    }

    public static void main(String[] args) {
        // 1 2 3 4 5
        int[] result = generateIntegers2(7, 9);
        for (int i : result) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(top3("  ...  "));
    }
}
