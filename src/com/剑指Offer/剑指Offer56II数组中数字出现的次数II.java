package com.剑指Offer;

import java.util.Arrays;

public class 剑指Offer56II数组中数字出现的次数II {
    public static void main(String[] args) {
        int[] nums = new int[]{3,4,3,3};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int num=0;
        for (int i = 0; i < nums.length-1; i=i+3) {

            if ((nums[i]!=nums[i+1]))
            {
                num = nums[i];
                break;
            }
        }
        return num;
    }
}
