package com.剑指offer陪跑营.a8动态规划;

import java.util.Arrays;

public class 找出最长递增子序列的长度 {
}

class Solution2 {

    public static void main(String[] args) {
        System.out.println(getResult(new int[]{1,5,2,4,3}));
    }

    public static int getResult(int[] nums) {
        int len = nums.length;
        int[] dp = new int[len];
        Arrays.fill(dp, 1);

        for (int i = len - 1; i >= 0; i--) {
            for (int j = i + 1; j < len; j++) {
                if (nums[j] > nums[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        int max = dp[0];
        for (int i = 1; i < len; i++) {
            if (max < dp[i]) {
                max = dp[i];
            }
        }
        return max;
    }
}