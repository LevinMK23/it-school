package com.samsung.module4.bs;

public class IntBinarySearch {

    // 1 2 3 4 5 6 7 8 O(N)
    private static int simpleSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }

    private static int binarySearch(int[] array, int key) {
        // 1 2 3 4 5 6 7 8 9, [8]
        // l               r
        // mid = (l + r) / 2
        // [1 2 3 4 [5]] 6 7 8 9
        // 6 7 [8] 9 ->
        int l = -1, r = array.length;
        while (r - l > 1) {
            int mid = (l + r) / 2;
            if (array[mid] == key) {
                return mid;
            } else if (array[mid] > key) {
                r = mid;
            } else {
                l = mid;
            }
        }
        return -1;
    }

    private static double sqrt(double n) {
        // sqrt = mid
        // mid * mid = n, sqrt(n) = mid
        double l = 0, r = n + 1, eps = 0.00000000000001;
        while (r - l > eps) {
            double mid = (l + r) / 2;
            if (mid * mid == n) {
                return mid;
            }
            if (mid * mid > n) {
                r = mid;
            } else {
                l = mid;
            }
        }
        return l;
    }

    public static void printSolution(double a, double b, double c) {
        double x0 = -b / (2 * a), x1, x2;
        double l, r, eps = 0.00000000000001, m;
        if (a > 0) {
            l = -1e9;
            r = x0;
            while (r - l > eps) {
                m = (r + l) / 2;
                if (a * m * m + b * m + c == 0) {
                    x1 = m;
                    break;
                } else if (a * m * m + b * m + c > 0) {
                    l = m;
                } else {
                    r = m;
                }
            }
            x1 = l;
            l = x0;
            r = 1e9;
            while (r - l > eps) {
                m = (r + l) / 2;
                if (a * m * m + b * m + c == 0) {
                    x2 = m;
                    break;
                } else if (a * m * m + b * m + c < 0) {
                    l = m;
                } else {
                    r = m;
                }
            }
            x2 = l;
            System.out.println(x1 + " " + x2);
        } else {
            l = -1e9;
            r = x0;
            while (r - l > eps) {
                m = (r + l) / 2;
                if (a * m * m + b * m + c == 0) {
                    x1 = m;
                    break;
                } else if (a * m * m + b * m + c < 0) {
                    l = m;
                } else {
                    r = m;
                }
            }
            x1 = l;
            l = x0;
            r = 1e9;
            while (r - l > eps) {
                m = (r + l) / 2;
                if (a * m * m + b * m + c == 0) {
                    x2 = m;
                    break;
                } else if (a * m * m + b * m + c > 0) {
                    l = m;
                } else {
                    r = m;
                }
            }
            x2 = l;
            System.out.println(x1 + " " + x2);
        }
    }


    public static void main(String[] args) {
        // search -> index
        // index = -1 (no value)
//        int[] array = {1, 2, 3, 4, 5};
//        for (int i = -1; i < 7; i++) {
//            int res = binarySearch(array, i);
//            System.out.println(i + " " + res);
//        }

        System.out.println(sqrt(10000));
        printSolution(-2, 7, 6);
    }

}
