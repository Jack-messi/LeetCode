package com.LC简单题;

import java.util.Arrays;

public class a283移动零 {
}


class Solution {

//    public static void main(String[] args) {
//        int[] nums = {0,1,0,3,12};
//        moveZeroes(nums);
//    }
//
//    public static void moveZeroes(int[] nums) {
//        int zero = 0, j = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == 0) {
//                zero++;
//            }
//        }
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] != 0) {
//                nums[j++] = nums[i];
//            }
//        }
//        for (int i = j; i < nums.length; i++) {
//            nums[i]=0;
//        }
//        System.out.println(Arrays.toString(nums));
//    }

    public void moveZeroes(int[] nums) {
        for (int num : nums) {
            if (num != 0) {
                System.out.println(num);
            }
        }
    }
}