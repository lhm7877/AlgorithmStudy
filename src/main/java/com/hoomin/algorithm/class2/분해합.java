package com.hoomin.algorithm.class2;

import java.util.Scanner;

public class 분해합 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int result = 0;
        for (int i = 0; i < number; i++) {
            final String numberString = String.valueOf(i);
            result = Integer.parseInt(numberString);
            final String[] split = numberString.split("");
            for (String s : split) {
                result += Integer.parseInt(s);
            }
            if (result == number) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);
    }
}
