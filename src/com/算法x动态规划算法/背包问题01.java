package com.算法x动态规划算法;
//解释一下，
// 0-1背包问题就是只能有两种情况，放或者是不放
// 背包问题的话，是表示可以放部分。

import java.util.Arrays;

public class 背包问题01 {
    public static void main(String[] args) {
        int[] w = new int[]{2, 3, 4, 5};
        int[] v = new int[]{3, 4, 5, 6};
        int bagV = 8;
        int[] dp[] = Bag01(w, v, bagV);
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[i].length; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] Bag01(int[] w, int[] v, int bagV) {
        int wlen = w.length;
        int[] dp[] = new int[wlen][bagV+1];

        for (int i = 0; i < wlen; i++) {
            for (int j = 0; j <= bagV; j++) {
                dp[i][j] = 0;
            }
        }

        for (int i = 1; i < wlen; i++) {
            for (int j = 1; j <= bagV; j++) {
                if (j < w[i]) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - w[i]] + v[i]);
                }
            }
        }
        return dp;
    }
}
