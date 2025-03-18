package com.github.BrunoHenriqueOliveira.codingchallenges.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class NumberOfWays {
    private static final int MOD = 1_000_000_007;
    private long[][] comb;

    public int numOfWays(int[] nums) {
        int n = nums.length;
        comb = new long[n + 1][n + 1];

        for (int i = 0; i <= n; i++) {
            comb[i][0] = comb[i][i] = 1;
            for (int j = 1; j < i; j++) {
                comb[i][j] = (comb[i - 1][j - 1] + comb[i - 1][j]) % MOD;
            }
        }

        List<Integer> numsList = new ArrayList<>();
        for (int num : nums) {
            numsList.add(num);
        }

        return (int) ((countWays(numsList) - 1 + MOD) % MOD);
    }

    private long countWays(List<Integer> nums) {
        if (nums.size() <= 2) return 1;
        int root = nums.get(0);
        List<Integer> leftSubtree = new ArrayList<>();
        List<Integer> rightSubtree = new ArrayList<>();

        for (int num : nums.subList(1, nums.size())) {
            if (num < root) leftSubtree.add(num);
            else rightSubtree.add(num);
        }

        int leftSize = leftSubtree.size();
        int rightSize = rightSubtree.size();

        long ways = comb[leftSize + rightSize][leftSize] % MOD;
        long leftWays = countWays(leftSubtree) % MOD;
        long rightWays = countWays(rightSubtree) % MOD;

        return (ways * leftWays % MOD) * rightWays % MOD;
    }
}
