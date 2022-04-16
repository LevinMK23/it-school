package com.samsung.module4.hashTable;

public class Table<T> {

    private static final int DEFAULT_CAPACITY = 16;

    static class Node<T> {

        T value;
        Node<T> next;

        public Node(T value) {
            this.value = value;
        }
    }

    private Node<T>[] table;
    private int capacity;


    public Table() {
        capacity = DEFAULT_CAPACITY;
        table = new Node[capacity];
    }

    private int h(int hashCode) {
        return hashCode % capacity;
    }

    public void add(T value) {
        int index = h(value.hashCode());
        if (table[index] == null) {
            table[index] = new Node<>(value);
        } else {
            Node<T> current = table[index];
            while (!current.value.equals(value)) {
                if (current.next == null) {
                    current.next = new Node<>(value);
                    return;
                }
                current = current.next;
            }
        }
    }

    public void remove(T value) {

    }

    public boolean contains(T value) {
        int index = h(value.hashCode());
        if (table[index] == null) {
            return false;
        }
        Node<T> current = table[index];
        while (current != null) {
            if (current.value.equals(value)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void print() {
        for (int i = 0; i < capacity; i++) {
            Node<T> current = table[i];
            int depth = 1;
            while (current != null) {
                System.out.print(current.value + " (" + depth + ")" + "[" + i + "] ");
                current = current.next;
                depth++;
            }
        }
        System.out.println();
    }

}
