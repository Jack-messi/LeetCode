package com.剑指offer陪跑营.a8动态规划;

public class 股票的最大利润 {
}


class Solution {
    public int maxProfit(int[] prices) {
        int Max = 0;
        int max = 0;
        for (int i = prices.length - 1; i >= 1; i--) {
            int tem = prices[i];
            for (int j = i - 1; j >= 0; j--) {
                if (tem - prices[j] > max) {
                    max = tem - prices[j];
                }
            }
            Max = max;
        }
        return Max;
    }
}
