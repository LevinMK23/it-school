package com.samsung.module4.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        SamsungList arrayList = new SamsungLinkedList();

        for (int i = 0; i < 15; i++) {
            arrayList.add(i);
        }

        arrayList.remove(4);
        arrayList.add(4, 15);

        arrayList.removeByValue(9);

        arrayList.removeByValue(14);
        arrayList.removeByValue(0);
        arrayList.removeByValue(1);

        arrayList.add(4, 17);

        System.out.println(arrayList);

        LinkedList<Integer> list = new LinkedList<>();


    }

}
