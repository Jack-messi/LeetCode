package com.LC简单题;

public class a485最大连续1的个数 {


    public int findMaxConsecutiveOnes(int[] nums) {
        int  max = 0, f = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                f++;
            } else {
                if (max < f) {
                    max = f;
                }
                f=0;
            }
            if (i== nums.length-1)
            {
                if (max < f) {
                    max = f;
                }
            }
        }
        return max;
    }
}
