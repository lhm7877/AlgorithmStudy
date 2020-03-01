package com.hoomin.algorithm;

import java.util.Scanner;

public class q10872 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        System.out.print(recursive(n));
    }

    private static int recursive(int n){
        if (n == 0) {
            return 1;
        } else {
            return n * recursive(n - 1);
        }
    }
}
