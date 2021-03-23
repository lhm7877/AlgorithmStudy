package com.hoomin.algorithm;

public class MaxConsecutiveOnes {

    public static void main(String[] args) {
        int[] p = {1,1,0,1,1,1};
        final int maxConsecutiveOnes = findMaxConsecutiveOnes(p);
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int x = 0;
        int result = 0;
        for (int num : nums) {
            if (num == 1) {
                x++;
                result = Math.max(x, result);
            } else {
                x = 0;
            }
        }
        return result;
    }
}
