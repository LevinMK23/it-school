package com.samsung.module4.sort;

import com.samsung.module4.hashTable.Table;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Rectangle rr1 = new Rectangle(2, 1);
        Rectangle rr2 = new Rectangle(1, 2);

        List<Rectangle> list = new ArrayList<>(
                List.of(rr1,
                        rr2,
                        new Rectangle(2, 2),
                        new Rectangle(2, 0),
                        new Rectangle(1, 3)
                )
        );

//        Collections.sort(list);

        list.sort((r1, r2) -> {
            if (r1.getWidth() - r2.getWidth() != 0) {
                return r1.getWidth() - r2.getWidth();
            }
            return r1.getLength() - r2.getLength();
        });

        list.sort(Comparator.comparingInt(Rectangle::getWidth)
                .thenComparingInt(Rectangle::getLength).reversed());

        System.out.println(list);

        Table<Integer> table = new Table<>();

        table.add(743);
        table.add(73);
        table.add(173);
        table.add(7543);
        table.add(7);

        table.print();


        System.out.println(table.contains(173));
        System.out.println(table.contains(12));

        HashSet<Integer> set = new HashSet<>();

    }
}
