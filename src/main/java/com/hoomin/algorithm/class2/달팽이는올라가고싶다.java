package com.hoomin.algorithm.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class 달팽이는올라가고싶다 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        final String[] s = reader.readLine().split(" ");
        final int A = Integer.parseInt(s[0]);
        final int B = Integer.parseInt(s[1]);
        final int V = Integer.parseInt(s[2]);
        final BigDecimal subtract = new BigDecimal(V-A);
        final BigDecimal subtract1 = new BigDecimal(A-B);
        final BigDecimal divide = subtract.divide(subtract1, BigDecimal.ROUND_UP);
        int i = divide.intValue();
        System.out.println(++i);

//        float A = Float.parseFloat(s[0]);
//        float B = Float.parseFloat(s[1]);
//        float V = Float.parseFloat(s[2]);
//        final float v = (V - A) / (A - B);
//        final double ceil = Math.ceil(v);
//        System.out.println(ceil + 1);
    }

    private static void extracted1(int A, int B, int V) {
        int i = 0;
        int result = 0;
        while (true) {
            result++;
            i = i + A;
            if (i >= V) {
                break;
            }
            i = i- B;
        }
        System.out.println(A + " " + B + " " + V + " : " + (A-B) + " " + (V-A) + " " + result);
    }

    private static void extracted(int A, int B, int V) {
        if((V-A) / (A-B) == A) {

        }
        int result = (V / (A - B));
        if (result < V) {
            result++;
        }
        System.out.println(result);
    }
}
