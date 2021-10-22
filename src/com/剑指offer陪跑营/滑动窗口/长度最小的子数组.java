package com.剑指offer陪跑营.滑动窗口;

public class 长度最小的子数组 {
}


class Solution {
    public  int minSubArrayLen(int target, int[] nums) {
        int i = 0, sum = 0, len = 0;
        //利用滑动窗口，非常巧妙
        for (int j = 0; j < nums.length; j++) {
            sum += nums[j];
            while (sum >= target) {
                if (len == 0) {
                    len = j - i + 1;
                } else {
                    len = Math.min(len, j - i + 1);
                }
                sum -= nums[i++];
            }
        }
        return len;
    }
}
