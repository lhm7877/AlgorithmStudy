package com.hoomin.algorithm;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class q10828 {

    private int[] elementData = new int[10000];
    private int size = 0;

    @Test
    public void test() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        if (reader.read() > 0) {
            final String[] input = reader.readLine().split(" ");
            switch (input[0]) {
                case "push" :
                    elementData[size] = Integer.parseInt(input[1]);
                    size++;
                    break;
                case "pop" :
                    if (size == 0) {
                        writer.write("-1\n");
                    } else {
                        writer.write(elementData[size] + "\n");
                        size--;
                    }
                    break;
                case "size" :
                    writer.write(size + "\n");
                    break;
                case "empty" :
                    if (size == 0) {
                        writer.write("1\n");
                    } else {
                        writer.write("0\n");
                    }
                    break;
                case "top" :
                    if (size == 0) {
                        writer.write("-1\n");
                    } else {
                        writer.write(elementData[size]+"\n");
                    }
                    break;
            }
        }
    }
}
