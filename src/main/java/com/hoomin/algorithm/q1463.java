package com.hoomin.algorithm;

import java.util.Scanner;
//1000000
//999997
public class q1463 {
    private static int[] memo;
    public static void main(String[] args) {
        for (int i = 1; i < 100000; i++) {
            System.out.println(i);
            test1(i);
            test2(i);
        }
        for (int i = 0; i < memo.length; i++) {
            if (d[i] != memo[i]) {
                System.out.println(i);
            }
        }
    }

    public static int[] d;
    public static int go(int n) {
        if (n == 1) {
            return 0;
        }
        if (d[n] > 0) {
            return d[n];
        }
        d[n] = go(n-1) + 1;
        if (n%2 == 0) {
            int temp = go(n/2)+1;
            if (d[n] > temp) {
                d[n] = temp;
            }
        }
        if (n%3 == 0) {
            int temp = go(n/3)+1;
            if (d[n] > temp) {
                d[n] = temp;
            }
        }
        return d[n];
    }

    public static void test2(int i) {
        d = new int[i+1];
        System.out.println("test2 : "+ go(i));
    }

    private static void test1(int i) {
        memo = new int[i+1];
        final int count = getCount(i);
        System.out.print("test1 : "+ count + "\t");
    }

    private static int getCount(int n) {
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        if (memo[n] > 0) {
            return memo[n];
        }
        int temp;
        if (n % 3 == 0) {
            memo[n] = getCount(n / 3) + 1;
        }

        if (n % 2 == 0) {
            temp = getCount(n / 2) + 1;
            if( temp < memo[n] || memo[n] == 0) {
                memo[n] = temp;
            }
        }

        temp = getCount(n - 1) + 1;
        if( temp < memo[n]  || memo[n] == 0) {
            memo[n] = temp;
        }

        return memo[n];
    }
}
