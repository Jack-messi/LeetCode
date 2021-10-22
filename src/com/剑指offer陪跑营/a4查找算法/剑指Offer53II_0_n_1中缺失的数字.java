package com.剑指offer陪跑营.a4查找算法;

public class 剑指Offer53II_0_n_1中缺失的数字 {
}

class Solution1 {
    public int missingNumber(int[] nums) {
        int i = 0;
        for (int num : nums) {
            if (i != num) {
                break;
            }
            i++;
        }
        return i;
    }
}

//二分法
class Solution2 {
    public int missingNumber(int[] nums) {
        int left = 0, right = nums.length - 1, mid;

        while (left <= right) {
            mid = (left + right) >> 1;
            if (nums[mid] == mid) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}