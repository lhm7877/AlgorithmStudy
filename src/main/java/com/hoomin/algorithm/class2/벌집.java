package com.hoomin.algorithm.class2;

import java.util.Scanner;

public class 벌집 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(test(scanner.nextInt()));
    }
    public static int test(int N) {
        if (N ==1 ) {
            return 1;
        }
        int x = 6;
        int y = 1;
        int max = 1;
        while(true) {
            max = max + (x * y);
            if (max >= N) {
                break;
            }
            y++;
        }
        return y + 1;
    }
}
