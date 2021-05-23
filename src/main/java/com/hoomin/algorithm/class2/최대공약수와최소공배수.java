package com.hoomin.algorithm.class2;

import java.util.Scanner;

public class 최대공약수와최소공배수 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String[] s = scanner.nextLine().split(" ");
        int A = Integer.parseInt(s[0]);
        int B = Integer.parseInt(s[1]);

        int max = Math.max(A, B);
        int min = Math.min(A, B);

        while (min > 0) {
            if ((A % min == 0) && (B % min == 0)) {
                break;
            }
            min--;
        }

        for (; max <= A*B; max++) {
            if ((max % A == 0) && (max % B == 0)) {
                break;
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
