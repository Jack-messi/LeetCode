package com.算法x贪心算法;

import java.util.Arrays;

public class LC322零钱兑换 {
    public static void main(String[] args) {
        int[] coins = new int[]{1};
        int amount = 0;
        int sum = coinChange(coins, amount);
        System.out.println(sum);
    }

    public static int coinChange(int[] coins, int amount) {
        int max = amount + 1;//这里，定义最大值为amount+1,因为amount是要凑的面额，amount+1就是他的最大值了
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, max);//所有数组赋值为最大值。
        dp[0] = 0;   //凑0元，需要0个硬币。

        //遍历每一个总额，其中是否有硬币满足
        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (i - coin < 0) {
                    continue;
                }
                dp[i] = Math.min(dp[i], dp[i - coin] + 1);
            }
        }
        //返回
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

