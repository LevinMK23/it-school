package com.samsung.lesson5;

public class DuplicateEncoder {

    static int[] count = new int[256];

    static String encode(String word){
        word = word.toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            count[word.charAt(i)]++;
        }
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            if (count[word.charAt(i)] > 1) {
                s.append(")");
            } else {
                s.append("(");
            }
        }
        return s.toString();
    }

    public static void main(String[] args) {
        System.out.println(encode("(( @"));
    }

}
