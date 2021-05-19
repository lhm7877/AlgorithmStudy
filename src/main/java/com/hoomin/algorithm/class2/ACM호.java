package com.hoomin.algorithm.class2;

import java.util.Scanner;

public class ACM호 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = Integer.parseInt(scanner.nextLine());
        while (T-- > 0) {
            final String[] s = scanner.nextLine().split(" ");
            Integer H = Integer.valueOf(s[0]);
            Integer W = Integer.valueOf(s[1]);
            Integer N = Integer.valueOf(s[2]);
            int front;
            if (N % H != 0) {
                front = N % H ;
            } else {
                front = H;
            }
            int back = (N / H);
            if (N % H != 0) {
                back++;
            }
            System.out.println(front + String.format("%02d", back));
        }
    }
}
