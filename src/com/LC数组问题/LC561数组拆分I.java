package com.LC数组问题;

import java.util.Arrays;

public class LC561数组拆分I {
    public static void main(String[] args) {

    }
    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        for (int i=0;i<nums.length;i=i+2)
        {
            sum+=nums[i];
        }
        return sum;
    }
}
