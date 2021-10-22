package com.算法x贪心算法;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        greedy1();
    }

    public static void greedy1() {
        //面额
        int[] values = {1, 2, 5, 10, 20, 50, 100};
        //数量
        int[] counts = {3, 3, 2, 1, 1, 3, 3};
        //获取需要各种面值多少张
        int[] result = getNumber1(447, values, counts);
        System.out.println("各币值的数量：" + Arrays.toString(result));
    }

    public static int[] getNumber1(int sum, int[] values, int[] counts) {
        int[] result = new int[7];
        int add = 0; //表示当前还需要凑多少钱
        for (int i = values.length - 1; i >= 0; i--) {
            int num = (sum - add) / values[i];
            if (num > counts[i]) {
                num = counts[i];
            }
            add = add + num * values[i];
            result[i] = num;
        }
        return result;
    }

    public int coinChange(int[] coins, int amount) {
        int max = amount + 1;
        int[] dp = new int[max];
        Arrays.fill(dp, max);
        for (int i = 1; i <= amount; i++) {

            for (int coin : coins) {
                if (i - coin < 0) {
                    continue;
                }
                dp[i] = Math.min(dp[i], dp[i - coin] + 1);
            }
        }
        return dp[amount] == max ? -1 : dp[amount];
    }
}
