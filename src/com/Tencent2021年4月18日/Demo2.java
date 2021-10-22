package com.Tencent2021年4月18日;

import java.util.Arrays;

public class Demo2 {
    public static void main(String[] args) {
        int[] coins = new int[]{1};
        int amount = 11;
        System.out.println(getnum(coins, amount));
    }

    public static int getnum(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        int maxV = amount + 1;
        Arrays.fill(dp, maxV);

        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (i - coin < 0) {
                    continue;
                }
                dp[i] = Math.min(dp[i], dp[i - coin] + 1);
            }
        }
        return dp[amount] == maxV ? -1 : dp[amount];
    }
}
