package com.hoomin.algorithm;

import java.util.Scanner;

public class 체스판_다시_칠하기 {
    public static void main(String[] args) {
        String[] answer = {"W","B","W","B","W","B","W","B"};


        Scanner scanner = new Scanner(System.in);
        final String[] input = scanner.nextLine().split(" ");
        String[][] board = new String[Integer.parseInt(input[0])][Integer.parseInt(input[1])];
        for (String[] strings : board) {
            String[] row = scanner.nextLine().split("");
            System.arraycopy(row, 0, strings, 0, row.length);
        }

        int result1 = Integer.MAX_VALUE;
        int result2 = Integer.MAX_VALUE;
        for (int x = 0; x < board.length - 7; x++) {
            for (int y = 0; y < board[0].length - 7; y++) {
                int matrixCount1 = 0;
                int matrixCount2 = 0;
                boolean flag = true;
                for (int i = 0; i < 8; i++) {
                    int rowCount = 0;
                    for (int j = 0; j < 8; j++) {
                        if (answer[j].equals(board[x+i][y+j])) {
                            rowCount++;
                        }
                    }
                    if (flag) {
                        matrixCount1 += rowCount;
                        matrixCount2 += (8 - rowCount);
                    } else {
                        matrixCount1 += (8 - rowCount);
                        matrixCount2 += rowCount;
                    }
                    flag = !flag;
                }
                result1 = Math.min(result1, matrixCount1);
                result2 = Math.min(result2, matrixCount2);
            }
        }
        System.out.println(Math.min(result1, result2));
    }
}