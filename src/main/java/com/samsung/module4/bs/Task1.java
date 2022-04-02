package com.samsung.module4.bs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), q = in.nextInt();

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(in.nextInt());
        }

        Collections.sort(list);

        for (int i = 0; i < q; i++) {
            int cur = in.nextInt();
            if (Collections.binarySearch(list, cur) >= 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
