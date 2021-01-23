package com.hoomin.algorithm;

import java.util.Scanner;

public class q1463_2 {
    static int[] result = new int[1000000];

    public static void main(String[] args) {
        final int minimum = getMinimum(new Scanner(System.in).nextInt());
        System.out.println(minimum);
    }

    public static int getMinimum(int n) {
        if (n == 1) {
            return 0;
        }
        if (result[n] > 0) {
            return result[n];
        }
        if (n % 3 == 0) {
            final int minimum = getMinimum(n / 3) + 1;
            result[n] = minimum;
        }
        if (n % 2 == 0) {
            final int minimum = getMinimum(n / 2) + 1;
            if (result[n] > minimum || result[n] == 0) {
                result[n] = minimum;
            }
        }
        final int minimum = getMinimum(n - 1) + 1;
        if (result[n] > minimum || result[n] == 0) {
            result[n] = minimum;
        }

        return result[n];
    }
}
