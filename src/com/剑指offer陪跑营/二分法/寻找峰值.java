package com.剑指offer陪跑营.二分法;

public class 寻找峰值 {
}


class Solution12 {
    public int findPeakElement(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        if (nums.length == 2) {
            return nums[0] > nums[1] ? 0 : 1;
        }
        if (nums[0] > nums[1]) {
            return 0;
        }
        int f = -1;

        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) {
                f = i;
                break;
            } else if (nums[i] < nums[i + 1] && i + 1 == nums.length - 1) {
                f = i + 1;
                break;
            }
        }
        return f;
    }
}