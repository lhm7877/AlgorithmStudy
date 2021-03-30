package com.hoomin.algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 팰린드롬수 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = reader.readLine();
        while (!str.equals("0")) {
            if (str.equals(new StringBuilder(str).reverse().toString())) {
                writer.write("yes\n");
            } else {
                writer.write("no\n");
            }
            str = reader.readLine();
        }
        reader.close();
        writer.close();
    }
}
