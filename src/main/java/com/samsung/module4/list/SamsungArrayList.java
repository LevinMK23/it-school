package com.samsung.module4.list;

import java.util.Arrays;

public class SamsungArrayList implements SamsungList {

    private static final int DEFAULT_CAPACITY = 5;

    private int[] data;
    private int size;
    private int capacity;

    public SamsungArrayList() {
        size = 0;
        capacity = DEFAULT_CAPACITY;
        data = new int[capacity];
    }

    // O(1)
    @Override
    public void add(int value) {
        add(size, value);
    }

    // O(N)
    private void ensureCapacity() {
        System.out.println("ensureCapacity");
        capacity *= 2;
        int[] tmp = new int[capacity];
        if (size >= 0) {
            System.arraycopy(data, 0, tmp, 0, size);
        }
        data = tmp;
    }

    // O(N)
    @Override
    public void add(int index, int value) {
        if (size >= capacity) {
            ensureCapacity();
        }
        // 1 2 3 4 5
        // 1 2 3 6 4 5
        if (size - 1 - index >= 0) {
            System.arraycopy(data, index, data, index + 1, size - 1 - index);
        }
        data[index] = value;
        size++;
    }

    // O(1)
    @Override
    public int get(int index) {
        return data[index];
    }

    // O(1)
    @Override
    public void set(int index, int value) {
        data[index] = value;
    }

    // O(1)
    @Override
    public int size() {
        return size;
    }

    // O(N)
    @Override
    public void remove(int index) {
        // 1 2 3 4 5
        // 1 2 4 5 0
        size--;
        if (size - index >= 0) {
            System.arraycopy(data, index + 1, data, index, size - index);
        }
    }

    // O(N)
    @Override
    public boolean removeByValue(int value) {
        for (int i = 0; i < size; i++) {
            if (data[i] == value) {
                remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            s.append(data[i]).append(',').append(' ');
        }
        s.delete(s.length() - 2, s.length()).append(']');
        return s.toString();
    }
}
