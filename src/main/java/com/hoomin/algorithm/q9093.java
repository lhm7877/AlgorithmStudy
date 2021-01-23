package com.hoomin.algorithm;

import java.util.Scanner;
import java.util.Stack;

public class q9093 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int T = Integer.parseInt(scanner.nextLine());
        while (T-- > 0) {
            final String string = scanner.nextLine();
            Stack<Character> stack = new Stack<>();
            for (char ch : string.toCharArray()) {
                if (ch == '\n' || ch == ' ') {
                    while (!stack.isEmpty()) {
                        System.out.print(stack.pop());
                    }
                    System.out.print(ch);
                } else {
                    stack.push(ch);
                }
            }
        }
    }
}
