package com.hoomin.algorithm.class2;

import java.util.Scanner;

public class 영화감독_숌 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int count = 0;
        int number = 0;
        while (count < input) {
            number++;
            if (String.valueOf(number).contains("666")) {
                count++;
            }
        }
        System.out.println(number);
    }
}
