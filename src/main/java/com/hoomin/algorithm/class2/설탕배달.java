package com.hoomin.algorithm.class2;

import java.util.Scanner;

public class 설탕배달 {
    private final static int THREE = 3;
    private final static int FIVE = 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        Integer result = 0;
        while (true) {
            if (a == 0) {
                break;
            }
            if (a % FIVE == 0) {
                result += 1;
                a -= FIVE;
                continue;
            }
            if (a % THREE == 0) {
                result += 1;
                a -= THREE;
                continue;
            }
            if (a > FIVE) {
                result += 1;
                a -= FIVE;
                continue;
            }
            result = -1;
            break;
        }
        System.out.println(result);
    }
}
