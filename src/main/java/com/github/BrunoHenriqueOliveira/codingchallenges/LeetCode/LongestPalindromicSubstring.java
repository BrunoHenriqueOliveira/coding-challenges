package com.github.BrunoHenriqueOliveira.codingchallenges.LeetCode;

public class LongestPalindromicSubstring {
    public  String longestPalindrome(String s) {
        if (s == null || s.length() == 0) return "";
        String t = preprocess(s);
        int n = t.length();
        int[] p = new int[n];
        int c = 0, r = 0;
        int maxLen = 0, center = 0;

        for (int i = 0; i < n; i++) {
            int mirror = 2 * c - i;
            if (i < r) {
                p[i] = Math.min(r - i, p[mirror]);
            }
            while (i + p[i] + 1 < n && i - p[i] - 1 >= 0 &&
                    t.charAt(i + p[i] + 1) == t.charAt(i - p[i] - 1)) {
                p[i]++;
            }
            if (i + p[i] > r) {
                c = i;
                r = i + p[i];
            }
            if (p[i] > maxLen) {
                maxLen = p[i];
                center = i;
            }
        }
        int start = (center - maxLen) / 2;
        return s.substring(start, start + maxLen);
    }
    private static String preprocess(String s) {
        StringBuilder sb = new StringBuilder("^");
        for (char c : s.toCharArray()) {
            sb.append("#").append(c);
        }
        sb.append("#$");
        return sb.toString();
    }
}
