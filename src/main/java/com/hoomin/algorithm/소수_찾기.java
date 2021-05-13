package com.hoomin.algorithm;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class 소수_찾기 {
    public static void main(String[] args) {
        boolean[] check = new boolean[1001];
        Arrays.fill(check, true);
        check[0] = check[1] = false;
        final double sqrt = Math.sqrt(1000);
        for (int i = 2; i < sqrt; i++) {
            for (int j = i*i; j <= 1000; j = j+i) {
                check[j] = false;
            }
        }

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        final List<Integer> numberList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int count = 0;
        for (Integer i : numberList) {
            if (check[i]) {
                count++;
            }
        }
        System.out.println(count);
    }
}
