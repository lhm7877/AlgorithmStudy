package com.hoomin.algorithm.class2;

import java.util.Scanner;

public class 부녀회장이될테야 {
    public static void main(String[] args) {
        int[][] apart = getApart();
        Scanner scanner = new Scanner(System.in);
        int T = Integer.parseInt(scanner.nextLine());
        while (T-- > 0) {
            int K = Integer.parseInt(scanner.nextLine());
            int N = Integer.parseInt(scanner.nextLine()) - 1;
            System.out.println(apart[K][N]);
        }
    }

    private static int[][] getApart() {
        int[][] apart = new int[15][14];
        for (int i = 0; i < apart.length; i++) {
            apart[i][0] = 1;
        }
        for (int i = 0; i < apart[0].length; i++) {
            apart[0][i] = i + 1;
        }
        for (int i = 1; i < apart.length; i++) {
            for (int j = 1; j < apart[0].length; j++) {
                int sum = 0;
                for (int k = 0; k <= j; k++) {
                    sum += apart[i-1][k];
                }
                apart[i][j] = sum;
            }
        }
        return apart;
    }
}
