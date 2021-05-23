package com.hoomin.algorithm.class2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 수정렬하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(reader.readLine());

        List<Integer> list = new ArrayList<>();
        while (N-- > 0) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        Collections.sort(list);
        for (Integer integer : list) {
            writer.write(integer + "\n");
        }
        reader.close();
        writer.close();
    }
}
