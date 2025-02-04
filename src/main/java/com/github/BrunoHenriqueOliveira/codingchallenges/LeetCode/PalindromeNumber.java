package com.github.BrunoHenriqueOliveira.codingchallenges.LeetCode;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        // Números negativos ou múltiplos de 10 (exceto 0) não são palíndromos
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int reversed = 0;
        int original = x;

        while (x > reversed) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }
        return x == reversed || x == reversed / 10;
    }
}
