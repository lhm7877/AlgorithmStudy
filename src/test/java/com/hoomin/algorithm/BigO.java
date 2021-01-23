package com.hoomin.algorithm;

import org.junit.Test;

public class BigO {

    @Test
    public void O_1(){
        int sum = 0;
        int N = 100000;
        sum = N*(N+1)/2;
        System.out.println(sum);
    }

    @Test
    public void O_N(){
        int sum = 0;
        int count = 0;
        int N = 100000;
        for (int i = 0; i < N; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    @Test
    public void O_N제곱(){
        int sum = 0;
        int N = 100000;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (i == j) {
                    sum += j;
                }
            }
        }
        System.out.println(sum);
    }
}
