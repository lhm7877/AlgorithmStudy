package com.hoomin.algorithm;

import java.util.Arrays;
import java.util.HashSet;

public class 전화번호목록 {
    public static void main(String[] args) {
        final boolean solution = solution3(new String[]{"1195524421", "119", "97674223"});
    }

    public static boolean solution(String[] phone_book) {
        HashSet<String> hashSet = new HashSet<>(Arrays.asList(phone_book));
        for(String phone : phone_book) {
            for(int i=0; i<phone.length(); i++) {
                if(hashSet.contains(phone.substring(0, i))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean solution2(String[] phone_book) {
        for (int i = 0; i < phone_book.length - 1; i++) {
            int length = phone_book[i].length();
            for (int j = i + 1; j < phone_book.length; j++) {
                if (phone_book[j].length() >= length && phone_book[i].equals((phone_book[j].substring(0, length)))) {
                    return false;
                } else if (phone_book[j].length() < length && phone_book[i].startsWith(phone_book[j])) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean solution3(String[] phone_book) {
        Arrays.sort(phone_book);
        for (int i = 0; i < phone_book.length-1; i++) {
            if (phone_book[i+1].startsWith(phone_book[i])) {
                return false;
            }
        }
        return true;
    }
}
