package com.hoomin.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * Pn 에서 n을 값으로 나눈 값이 큰거부터 써야할듯
 * 
 * @author : lhm0805
 * @date : 2020. 07. 08. 오후 11:27:48
 */
public class q11052 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int[] cardArray = new int[1001];


        List<Integer> cardList = new ArrayList<>();

        List<Integer> cards = new ArrayList<>();
        for (int i = 1; i <= T; i++) {
            final int nextInt = scanner.nextInt();
            cardArray[i] = nextInt;
            cardList.add(nextInt);
        }

        Collections.sort(cardList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });

        System.out.println();
    }
}
