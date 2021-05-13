package com.hoomin.algorithm;

import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class 수_찾기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final Integer N = Integer.valueOf(scanner.nextLine());
        final String[] A = scanner.nextLine().split(" ");
        scanner.nextLine();
        final String[] M = scanner.nextLine().split(" ");
        final Set<String> aSet = Stream.of(A).collect(Collectors.toSet());
        for (String s : M) {
            System.out.println(aSet.contains(s) ? 1 : 0);
        }
    }
}
