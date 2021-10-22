package com.算法x动态规划算法;


public class LC416分割等和子集 {

    public static void main(String[] args) {
        int[] nums = new int[]{1,5,11,5};
        canPartition(nums);
    }

/*    public static boolean canPartition1(int[] nums)
    {

    }*/
    public static boolean canPartition(int[] nums) {
        int len = nums.length;
        // 题目已经说非空数组，可以不做非空判断
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        // 特判：如果是奇数，就不符合要求
        if ((sum & 1) == 1) {
            return false;
        }

        int target = sum / 2;
        // 创建二维状态数组，行：物品索引，列：容量（包括 0）
        //dp[i][j]表示前[0,i]个物品中，恰好能取的某些物品，使得其总和为j
        boolean[][] dp = new boolean[len][target + 1];



        // 先填表格第 0 行，第 1 个数，此时，只能让容积为它自己的背包恰好装满
        /*
            解释一下为什么dp[0][nums[1]]不能为0。因为前[0,0]个物品，不可能是第一个。nums[1]是第一个物品了
            所以说：逻辑上就错误了。

         */
        if (nums[0] <= target) {
            dp[0][nums[0]] = true;
        }
        // 再填表格后面几行
        for (int i = 1; i < len; i++) {
            for (int j = 0; j <= target; j++) {
                // 直接从上一行先把结果抄下来，然后再修正
                dp[i][j] = dp[i - 1][j];

                if (nums[i] == j) {
                    dp[i][j] = true;
                    continue;
                }
                if (nums[i] < j) {
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - nums[i]];
                }
            }
        }
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[i].length; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        return dp[len - 1][target];

    }
}
