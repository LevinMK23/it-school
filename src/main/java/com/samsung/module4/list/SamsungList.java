package com.samsung.module4.list;

public interface SamsungList {

    void add(int value);

    void add(int index, int value);

    int get(int index);

    void set(int index, int value);

    int size();

    void remove(int index);

    boolean removeByValue(int value);

}
