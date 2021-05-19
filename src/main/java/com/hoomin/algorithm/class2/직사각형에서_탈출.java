package com.hoomin.algorithm.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 직사각형에서_탈출 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        final int[] intArray = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(Math.min(Math.min(intArray[2] - intArray[0], intArray[0]), Math.min(intArray[3] - intArray[1], intArray[1])));
        reader.close();
    }
}
