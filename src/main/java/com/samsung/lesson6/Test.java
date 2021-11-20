package com.samsung.lesson6;

public class Test {

    static int a = 0;

    public static void main(String[] args) {
        int n = 5, m = 4, k = 0;
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < m; j++) {
                    matrix[i][j] = k;
                    k++;
                }
            } else {
                for (int j = m - 1; j >= 0; j--) {
                    matrix[i][j] = k;
                    k++;
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}