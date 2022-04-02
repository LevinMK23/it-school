package com.samsung.module4.bs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task2V2 {

    static class Pair {

        public static Pair of(int l, int r) {
            return new Pair(l, r);
        }

        private int l, r;

        public Pair(int l, int r) {
            this.l = l;
            this.r = r;
        }

        public int getL() {
            return l;
        }

        public int getR() {
            return r;
        }

        public void setR(int r) {
            this.r = r;
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), q = in.nextInt();

        Map<Integer, Pair> map = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            int cur = in.nextInt();
            if (!map.containsKey(cur)) {
                map.put(cur, Pair.of(i, i));
            } else {
                map.get(cur).setR(i);
            }
        }

        for (int i = 0; i < q; i++) {
            int cur = in.nextInt();
            if (map.containsKey(cur)) {
                Pair pair = map.get(cur);
                System.out.println(pair.getL() + " " + pair.getR());
            } else {
                System.out.println(0);
            }
        }
    }
}
