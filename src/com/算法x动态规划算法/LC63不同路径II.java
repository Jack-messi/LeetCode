package com.算法x动态规划算法;

public class LC63不同路径II {

    public static void main(String[] args) {
        int[][] ob = new int[][]{{0,0}};
        System.out.println(uniquePathsWithObstacles(ob));
    }

    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int[][] dp = new int[obstacleGrid.length][obstacleGrid[0].length];

        for (int i = 0; i < obstacleGrid.length; i++) {
            if (obstacleGrid[i][0] == 1)
                break;
            dp[i][0] = 1;

        }
        for (int i = 0; i < obstacleGrid[0].length; i++) {
//            System.out.println(obstacleGrid[0].length);
            if (obstacleGrid[0][i] == 1)
                break;
            dp[0][i] = 1;

        }

        for (int i = 1; i < obstacleGrid.length; i++) {
            for (int j = 1; j < obstacleGrid[i].length; j++) {
                if ( obstacleGrid[i][j] != 1) {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }


        }

//        for (int i = 0; i < obstacleGrid.length; i++) {
//            for (int j = 0; j < obstacleGrid[i].length; j++) {
//                System.out.print(dp[i][j] + "  ");
//
//            }
//            System.out.println();
//        }

        return dp[obstacleGrid.length - 1][obstacleGrid[0].length - 1];
    }
}
