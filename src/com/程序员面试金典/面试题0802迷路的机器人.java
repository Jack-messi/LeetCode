package com.程序员面试金典;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 面试题0802迷路的机器人 {
}
/*
定义：dp[i][j]表示机器人是否能走到（i，j）位置。初始化 dp[0][0]=1；
第一行和第一列要单独处理。
1、利用dp动态规划，，当前格子的状态，取决于，它左边，或者它上面。
2、如果走到终点，dp[m][n]==0;表示没有路径
2、

 */


class Solution0802 {
    public List<List<Integer>> pathWithObstacles(int[][] obstacleGrid) {

        List<List<Integer>> res = new ArrayList<>();
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];

        //判断起点和终点都是障碍物的情况，
        if (obstacleGrid[0][0] == 1 || obstacleGrid[m - 1][n - 1] == 1) {
            return res;
        }

        dp[0][0] = 1;
        //处理第一行
        for (int i = 1; i < n; i++) {
            if (obstacleGrid[0][i] == 1) {
                dp[0][i] = 0;
            } else {
                dp[0][i] = dp[0][i - 1];
            }
        }

        //处理第一列
        for (int i = 1; i < m; i++) {
            if (obstacleGrid[i][0] == 1) {
                dp[i][0] = 0;
            } else {
                dp[i][0] = dp[i - 1][0];
            }
        }

        //计算状态转移方程
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (obstacleGrid[i][j] == 1) {
                    dp[i][j] = 0;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        //如果走到终点，dp[m-1][n-1]==0;表示没有路径
        if (dp[m - 1][n - 1] == 0) {
            return res;
        }
        int r = m - 1, c = n - 1;

        while (r != 0 || c != 0) {
            List<Integer> list = new ArrayList<>();
            list.add(r);
            list.add(c);
            res.add(list);


            int up = 0;
            if (r > 0) {
                up = dp[r - 1][c];
            }
            int left = 0;
            if (c > 0) {
                left = dp[r][c - 1];
            }
            if (up >= left) {
                r--;
            } else {
                c--;
            }
        }

        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(0);
        res.add(list);

        Collections.reverse(res);

        return res;
    }
}

