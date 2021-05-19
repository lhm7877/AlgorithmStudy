package com.hoomin.algorithm.class2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class 블랙잭 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String[] s = scanner.nextLine().split(" ");
        final int N = Integer.parseInt(s[0]);
        final int M = Integer.parseInt(s[1]);
        List<Integer> list = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .filter(integer -> integer <= M)
                .collect(Collectors.toList());
        System.out.println(getMax(M, list));
    }

    private static int getMax(int M, List<Integer> list) {
        int max = 0;
        int result = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 1; j < list.size(); j++) {
                for (int k = 2; k < list.size(); k++) {
                    if(i != j && i != k && j != k) {
                        result = list.get(i);
                        result += list.get(j);
                        result += list.get(k);
                        if(result == M) {
                            return result;
                        }
                        if(result <= M) {
                            max = Math.max(result, max);
                        }
                    }
                }
            }
        }
        return max;
    }
}
