package com.hoomin.algorithm.class2;

import java.math.BigInteger;
import java.util.Scanner;

public class Hashing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        final char[] chars = scanner.nextLine().toCharArray();
        BigInteger result = BigInteger.ZERO;
        final BigInteger MOD = new BigInteger("1234567891");
        final BigInteger bigInteger = new BigInteger("31");

        for (int i = 0; i < chars.length; i++) {
            final int number = chars[i] - 'a' + 1;
            final BigInteger multiply = BigInteger.valueOf(number).multiply(bigInteger.pow(i).mod(MOD));
            result = result.add(multiply);
            result = result.mod(MOD);
        }

        System.out.println(result);
    }

}
