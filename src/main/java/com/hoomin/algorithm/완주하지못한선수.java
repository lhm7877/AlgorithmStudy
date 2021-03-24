package com.hoomin.algorithm;

import java.util.Arrays;

public class 완주하지못한선수 {

    public static void main(String[] args) {
        final String solution = solution(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"}, new String[]{"josipa", "filipa", "marina", "nikola"});
    }

    public static String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        for (int i = 0; i < participant.length - 1; i++) {
            if (!completion[i].equals(participant[i])) {
                return participant[i];
            }
        }
        return participant[participant.length-1];
    }
}
