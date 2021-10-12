package com.samsung.lesson3;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        int currentArraySize = n, length = 1, repeatCount, currentValue;

        do {

            repeatCount = 1;
            for (int i = 0; i < currentArraySize - 1; i++) {
                if (a[i] == a[i + 1]) {
                    length++;
                    if (i == currentArraySize - 2) {
                        currentValue = a[i];
                        currentValue++;
                        a[i - length + 2] = currentValue;
                        currentArraySize -= length - 1;
                        length = 1;
                        break;
                    }
                } else {
                    if (length > 1) {
                        currentValue = a[i];
                        currentValue++;
                        a[i - length + 1] = currentValue;
                        if (currentArraySize - (i + 1) >= 0) {
                            System.arraycopy(a, i + 1, a, i + 1 - length + 1, currentArraySize - (i + 1));
                        }
                        currentArraySize -= length - 1;
                        length = 1;
                        break;
                    }
                    repeatCount++;
                    length = 1;
                }
            }
        } while (repeatCount < currentArraySize);

        for (int i = 0; i < currentArraySize; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
