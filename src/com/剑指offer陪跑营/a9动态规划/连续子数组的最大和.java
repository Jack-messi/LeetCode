package com.剑指offer陪跑营.a9动态规划;

public class 连续子数组的最大和 {
}

class Solution {
    public int maxSubArray(int[] nums) {
        int len = nums.length;
        int[] dp = new int[len];
        dp[0] = nums[0];
        int max = dp[0];

        for (int i=1;i<len;i++)
        {
            dp[i] = Math.max(dp[i-1]+nums[i],nums[i]);
            max = Math.max(max,dp[i]);
        }
        return max;
    }
}

