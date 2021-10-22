package com.算法x动态规划算法;

/*
LeetCode 518. 零钱兑换 II
经典的动态规划题目：
dp[n] 表示：凑成n元的方案数；

dp[0]=1 表示：凑成0元的货币组合为1种。

dp[n] = dp[n] + dp[n-coin];
其中等于号后面的
dp[n] 表示上一个n元的方案数
dp[n-coin]  表示n元减去一个coin的方案数，此时如果要凑成n元，只需要加上当前这个coin即可

 */

public class LC518零钱兑换II {
    public int change(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;

        for (int coin : coins) {
            for (int j = coin; j <= amount; j++) {
                dp[j] = dp[j] + dp[j - coin];
            }
        }
        return dp[amount];
    }
}
