package com.hoomin.algorithm;

import java.util.Scanner;

public class q11727 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        int[] d = new int[1001];
        d[1] = 1;
        d[2] = 3;
        for (int i = 3; i <= n; i++) {
            d[i] = (d[i-1] + 2*d[i-2])%10007;
        }
        System.out.print(d[n]);
    }
}
