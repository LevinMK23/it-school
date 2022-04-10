package com.samsung.module4.bst;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Bst implements Iterable<Integer> {

    @Override
    public Iterator<Integer> iterator() {

        LinkedList<Integer> list = new LinkedList<>();
        initIterator(root, list);

        return new Iterator<Integer>() {

            @Override
            public boolean hasNext() {
                return !list.isEmpty();
            }

            @Override
            public Integer next() {
                return list.pollFirst();
            }

        };
    }

    private class Node {

        int value;

        Node parent;
        Node left, right;

        public Node(int value, Node parent) {
            this.value = value;
            this.parent = parent;
        }
    }

    private Node root;

    private void initIterator(Node node, List<Integer> list) {
        if (node == null) {
            return;
        }
        initIterator(node.left, list);
        list.add(node.value);
        initIterator(node.right, list);
    }

    private void add(Node node, int value) {
        if (value > node.value) {
            if (node.right == null) {
                node.right = new Node(value, node);
            } else {
                add(node.right, value);
            }
        } else {
            if (node.left == null) {
                node.left = new Node(value, node);
            } else {
                add(node.left, value);
            }
        }
    }

    public void add(int value) {
        if (root == null) {
            root = new Node(value, null);
        } else {
            add(root, value);
        }
    }

    private boolean contains(Node node, int value) {
        if (node == null) {
            return false;
        }
        if (node.value == value) {
            return true;
        } else if (value > node.value) {
            // right
            return contains(node.right, value);
        } else {
            // left
            return contains(node.left, value);
        }
    }

    public boolean contains(int value) {
        if (root == null) {
            return false;
        }
        return contains(root, value);
    }

    private void print(Node node) {
        if (node == null) {
            return;
        }
        print(node.left);
        System.out.print(node.value + " ");
        print(node.right);
    }

    public void print() {
        print(root);
        System.out.println();
    }
}
