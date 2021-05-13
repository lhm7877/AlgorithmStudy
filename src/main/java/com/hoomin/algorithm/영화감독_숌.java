package com.hoomin.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class 영화감독_숌 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int num = 666;
        int count = 1;

        List<Integer> list = new ArrayList<>();
        list.add(666);
        while(count != N) {
            num++;

            // int형인 num을 String으로 변환한 뒤, "666"이란 문자열이 있는지 검사
            if(String.valueOf(num).contains("666")) {
                count++;
                list.add(num);
            }
        }
        List<Long> extracted = extracted(N);
        System.out.println();
    }

    private static List<Long> extracted(int number) {
        List<Long> list = new ArrayList<>();
        for (int i = 0; i < 6666; i++) {
            list.add(Long.valueOf(i + "666"));
            list.add(Long.valueOf("666" + i));
            list.add(Long.valueOf("6660" + i));
            list.add(Long.valueOf("66600" + i));
            list.add(Long.valueOf("666000" + i));
        }
        return list.stream().distinct().sorted().collect(Collectors.toList());
    }
}
