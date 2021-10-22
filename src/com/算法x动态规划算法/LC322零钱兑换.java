package com.算法x动态规划算法;

import java.util.Arrays;

public class LC322零钱兑换 {
    public static void main(String[] args) {
        int[] coins = new int[]{1};
        int amount = 0;
        int sum = coinChange(coins, amount);
        System.out.println(sum);
    }

    public static int coinChange(int[] coins, int amount) {
        //初始化dp表，最大值目标最大值 + 1,相当于无穷大
        int max = amount + 1;
        int[] dp = new int[amount + 1];
        //初始化dp表里面数据全部为max
        Arrays.fill(dp, max);
        //已知目标金额为0的时候，需要0个硬币
        dp[0] = 0;
        //遍历1到amount需要多少硬币
        for(int i = 1; i <= amount; i++) {
            //遍历所有硬币
            for(int coin : coins) {
                if(i - coin < 0) continue;
                //子问题dp[i-coin]加1枚硬币就是当前硬币的需要个数
                dp[i] = Math.min(dp[i], dp[i-coin] + 1);
            }
        }
        //如果目标金额的一直没有答案返回-1
        return dp[amount] == max ? -1 : dp[amount];
    }
}


//
//class Solution {
//    public int coinChange(int[] coins, int amount) {
//        if (amount < 1) {
//            return 0;
//        }
//        //coins：零钱数组。amount：要求的金额。new int[amount]：记忆化搜索的数组。
//        return coinChange(coins, amount, new int[amount]);
//    }
//
//    private int coinChange(int[] coins, int rem, int[] count) {
//        if (rem < 0) {
//            return -1;
//        }
//        if (rem == 0) {
//            return 0;
//        }
//        if (count[rem - 1] != 0) {
//            return count[rem - 1];
//        }
//        int min = Integer.MAX_VALUE;
//        for (int coin : coins) {
//            int res = coinChange(coins, rem - coin, count);
//            if (res >= 0 && res < min) {
//                min = 1 + res;
//            }
//        }
//        count[rem - 1] = (min == Integer.MAX_VALUE) ? -1 : min;
//        return count[rem - 1];
//    }
//}

