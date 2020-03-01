package com.hoomin.algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BuffereReaderWriterTest {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        final String s = reader.readLine();
        writer.write(s);
        writer.write(s);
        System.out.println(123);
        writer.flush();
        writer.flush();
        System.out.println();
        writer.close();
    }
}
