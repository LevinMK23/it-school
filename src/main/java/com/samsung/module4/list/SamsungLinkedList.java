package com.samsung.module4.list;

public class SamsungLinkedList implements SamsungList {

    private class ListNode {
        int value;
        ListNode next, prev;

        public ListNode(int value) {
            this.value = value;
        }
    }

    private ListNode head;
    private ListNode tail;
    private int size;

    // O(1)
    @Override
    public void add(int value) {
        ListNode node = new ListNode(value);
        if (tail == null) {
            tail = head = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
        size++;
    }

    @Override
    public void add(int index, int value) {
        ListNode cur = head;

        for (int i = 0; i < index - 1; i++) {
            cur = cur.next;
        }

        ListNode node = new ListNode(value);

        ListNode next = cur.next;
        cur.next = node;
        node.prev = cur;
        node.next = next;
        next.prev = node;

        size++;
    }

    // O(N)
    @Override
    public int get(int index) {
        ListNode cur = head;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return cur.value;
    }

    // O(N)
    @Override
    public void set(int index, int value) {
        ListNode cur = head;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        cur.value = value;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void remove(int index) {

        ListNode cur = head;

        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }

        removeNode(cur);
    }

    @Override
    public boolean removeByValue(int value) {
        ListNode cur = head;
        while (cur != null) {
            if (cur.value == value) {
                removeNode(cur);
            }
            cur = cur.next;
        }
        return false;
    }

    private void removeNode(ListNode cur) {

        if (cur == head) {
            head = head.next;
            head.prev = null;
            cur.next = null;
        } else if (cur == tail) {
            tail = tail.prev;
            tail.next = null;
            cur.prev = null;
        } else {
            ListNode prev = cur.prev;
            ListNode next = cur.next;

            prev.next = next;
            next.prev = prev;

            cur.next = null;
            cur.prev = null;
        }
        size--;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("[");
        ListNode cur = head;
        while (cur != null) {
            s.append(cur.value).append(", ");
            cur = cur.next;
        }
        s.delete(s.length() - 2, s.length()).append(']');
        return s.toString();
    }
}
