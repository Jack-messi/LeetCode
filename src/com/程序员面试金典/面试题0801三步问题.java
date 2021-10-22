package com.程序员面试金典;

public class 面试题0801三步问题 {
}


class Solution0801 {
    public int waysToStep(int n) {
        int[] dp = new int[n + 2];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = ((dp[i - 1] + dp[i - 2]) % 1000000007 + dp[i - 3]) % 1000000007;
        }
        return dp[n];
    }
}


class Solution08012 {
    public int waysToStep(int n) {
//        int[] dp = new int[n + 2];
        if (n < 3) {
            return n;
        }
        int dp0 = 1;
        int dp1 = 1;
        int dp2 = 2;
        int dp=0;
        for (int i = 3; i <= n; i++) {
            dp = ((dp0 + dp1) % 1000000007 + dp2) % 1000000007;
            dp0 = dp1;
            dp1 = dp2;
            dp2 = dp;
        }
        return dp;
    }
}