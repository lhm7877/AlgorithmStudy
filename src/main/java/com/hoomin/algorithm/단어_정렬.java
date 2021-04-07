package com.hoomin.algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class 단어_정렬 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(reader.readLine());
        List<String> list = new ArrayList<>();
        while (T-- > 0) {
            list.add(reader.readLine());
        }
        list.stream()
                .distinct()
                .sorted(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder()))
                .forEach(s -> {
                    try {
                        writer.write(s + "\n");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
        reader.close();
        writer.close();
    }
}
