package com.剑指offer陪跑营.a13;

public class 调整数组顺序使奇数位于偶数前面 {
}

class Solution {
    public int[] exchange(int[] nums) {
        int left, right;
        left = 0;
        right = nums.length - 1;
        while (left < right) {
            if (nums[left] % 2 == 1) {
                left++;
            } else if (nums[right] % 2 == 0) {
                right--;
            } else {
                int temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
                left++;
                right--;
            }
        }
        return nums;
    }
}