package com.hoomin.algorithm;

import java.util.HashMap;
import java.util.Map;

public class 위장 {
    public static void main(String[] args) {
        final int solution = solution(new String[][]{{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}});
        final int solution2 = solution(new String[][]{{"crowmask", "face"}, {"bluesunglasses", "face"}, {"smoky_makeup", "face"}});
        final int solution3 = solution(new String[][]{{"crowmask", "face"}, {"bluesunglasses", "face"}, {"A", "eye"}, {"B", "pants"}, {"C", "hat"}});
    }

    public static int solution(String[][] clothes) {
        Map<String, Integer> clothMap = new HashMap<>();
        for (String[] clothe : clothes) {
            clothMap.put(clothe[1], clothMap.getOrDefault(clothe[1], 0) + 1);
        }
        return clothMap.values().stream().mapToInt(integer -> integer + 1).reduce(1, (a, b) -> a * b) - 1;
    }
}
