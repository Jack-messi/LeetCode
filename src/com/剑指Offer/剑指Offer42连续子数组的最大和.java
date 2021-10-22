package com.剑指Offer;

public class 剑指Offer42连续子数组的最大和 {
    public static void main(String[] args) {
        int[] nums = new int[]{-1,-1};//{-1, -2, -3, -4, 1, 2, 3, 4};
        System.out.println(maxSubArray(nums));
    }

//    public static int maxSubArray(int[] nums) {
//        int dp[] = new int[nums.length];
//        dp[0] = nums[0];
//        int max = dp[0];
//
//        for (int i = 1; i < nums.length; i++) {
//            dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
//            max = Math.max(max, dp[i]);
//        }
//        return max;
//
//    }

    public static int maxSubArray(int[] nums) {
        int max = nums[0];
        int sum = 0;
        for (int num : nums) {
            sum += num;
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }
}
