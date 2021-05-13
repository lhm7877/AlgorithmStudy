package com.hoomin.algorithm;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class 직각삼각 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            final String s = scanner.nextLine();
            if (s.equals("0 0 0")) {
                break;
            }

            final List<BigDecimal> numbers = Arrays.stream(s.split(" "))
                    .map(BigDecimal::new)
                    .collect(Collectors.toList());

            final BigDecimal maxBigDecimal = numbers.stream().max(BigDecimal::compareTo).get();
            numbers.remove(maxBigDecimal);
            final BigDecimal bigDecimal1 = numbers.stream()
                    .map(bigDecimal -> bigDecimal.pow(2))
                    .reduce(BigDecimal::add)
                    .get();

            if (bigDecimal1.equals(maxBigDecimal.pow(2))) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
    }
}
