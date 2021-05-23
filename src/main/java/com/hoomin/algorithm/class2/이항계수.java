package com.hoomin.algorithm.class2;

import java.util.*;

/**
 * 이항계수 : N!/K!(n-k)!
 *
 * @author : lhm0805
 * @date : 2021. 05. 23. 오후 10:46:18
 */
public class 이항계수 {
    public static void main(String[] a) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int k=s.nextInt();
        int[] r={1,1,2,6,24,120,720,5040,40320,362880,3628800};
        System.out.print(r[n]/(r[k]*r[n - k]));
    }
}
