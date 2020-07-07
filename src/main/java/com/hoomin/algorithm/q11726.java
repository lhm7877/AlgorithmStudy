package com.hoomin.algorithm;

import java.util.Scanner;

/**
 *
 * @author : lhm0805
 * @date : 2020. 05. 16. 오후 06:57:43
 */
public class q11726 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        final int N = scanner.nextInt();
        int[] memo = new int[N+1];
        memo[1] = 1;
        memo[2] = 2;
        memo[3] = 3;
        for (int i = 4; i <= N; i++) {
            memo[i] = (memo[i-1] + memo[i-2]) % 10007;
        }
        System.out.print(memo[N]);
    }
}
