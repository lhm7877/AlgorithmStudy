package com.hoomin.algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class q10828 {

    private static int[] elementData = new int[10000];
    private static int size = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(reader.readLine());
        while (T-- > 0) {
            final String s = reader.readLine();
            final String[] input = s.split(" ");
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
            writer.flush();
        }
        reader.close();
        writer.close();
    }
}
