package com.hoomin.algorithm;

import java.util.Scanner;

/**
 * 분할정복하듯이 나눠서 생각해보자
 * d(n) = ? + ?로 쪼개보자
 */
public class q9095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] d = new int[11];
        d[1] = 1;
        d[2] = 2;
        d[3] = 4;
        d[4] = 7;

        int t = sc.nextInt();

        for (int i = 5; i < 11; i++) {
            d[i] = d[i - 1] + d[i - 2] + d[i - 3];
        }

        while (t-- > 0) {
            int n = sc.nextInt();
            System.out.println(d[n]);
        }
    }
}
