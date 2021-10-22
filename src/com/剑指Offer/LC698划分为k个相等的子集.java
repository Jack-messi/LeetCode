package com.剑指Offer;

import java.util.Arrays;
import java.util.HashSet;

public class LC698划分为k个相等的子集 {
    public static void main(String[] args) {
        int[] nums = new int[]{10,10,10,7,7,7,7,7,7,6,6,6};
        System.out.println(canPartitionKSubsets(nums,3));
    }

    public static boolean canPartitionKSubsets(int[] nums, int k) {
        int sum = 0;
        HashSet<Integer> set = new HashSet<>();

        for (int i : nums) {
            sum += i;
            set.add(i);
        }
        System.out.println(sum);
        set.add(0);
        //判断是否为整数
        if (sum % k != 0) {
            return false;
        }
        int avg = sum / k;
        int result = 0,f=0;

        for (int i=0;i<nums.length;i++) {
            if (avg == nums[i]) {
                f++;
                continue;
            }
            if (set.contains(avg-nums[i]))
            {
                result++;
            }
        }
        System.out.println(f);
        System.out.println(result);
        result = (result>>1)+f;
        if (result==k)
        {
            return true;
        }
        return false;
    }
}
