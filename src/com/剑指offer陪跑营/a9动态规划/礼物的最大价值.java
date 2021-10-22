package com.剑指offer陪跑营.a9动态规划;

public class 礼物的最大价值 {
}

class Solution2 {
    public int maxValue(int[][] grid) {
        int high = grid.length;  //多少行
        int len = grid[0].length; //多少列

        int[][] dp = new int[high][len];
//        dp[0][0] = grid[0][0];
        int sum = 0;
        for (int i = 0; i < high; i++) {
            sum += grid[i][0];
            dp[i][0] = sum;
        }
        sum = 0;
        for (int i = 0; i < len; i++) {
            sum += grid[0][i];
            dp[0][i] = sum;
        }

        for (int i = 1; i < high; i++) {
            for (int j = 1; j < len; j++) {
                dp[i][j] = Math.max(dp[i][j - 1] + grid[i][j], dp[i - 1][j] + grid[i][j]);
            }
        }

        return dp[high-1][len-1];
    }
}



