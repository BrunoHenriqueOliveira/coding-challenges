package com.github.BrunoHenriqueOliveira.codingchallenges.LeetCode;

import java.util.HashSet;

public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            HashSet<Character> set = new HashSet<>();
            int length = 0;
            for (int j = i; j < s.length(); j++) {
                if (set.contains(s.charAt(j))) {
                    break;
                }
                set.add(s.charAt(j));
                length++;
            }
            maxLength = Math.max(maxLength, length);
        }
        return maxLength;
    }
}
