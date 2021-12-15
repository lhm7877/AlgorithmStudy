package com.hoomin.algorithm.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class 덩치 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());

        List<int[]> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            final String[] s = reader.readLine().split(" ");
            final int[] ints = {Integer.parseInt(s[0]), Integer.parseInt(s[1])};
            list.add(ints);
        }

        List<String> resultList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            final int[] person1 = list.get(i);
            int rank = 1;
            for (int j = 0; j < list.size(); j++) {
                if (i == j) {
                    continue;
                }
                final int[] person2 = list.get(j);
                if (person1[0] < person2[0] && person1[1] < person2[1]) {
                    rank++;
                }
            }
            resultList.add(String.valueOf(rank));
        }

        final String answer = String.join(" ", resultList);
        System.out.print(answer);
    }
}
