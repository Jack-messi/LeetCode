package com.剑指Offer;

import java.util.Arrays;

public class 剑指Offer61扑克牌中的顺子 {
    public static void main(String[] args) {

    }

    public static boolean isStraight(int[] nums) {
        Arrays.sort(nums);

        int zsum = 0, diff = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0) {
                zsum++;
            } else {
                if (nums[i] == nums[i + 1]) {
                    break;
                }
                if (nums[i + 1] != nums[i] + 1) {
                    diff+=nums[i+1]-nums[i]-1;
                }
            }
        }
        return zsum>=diff;

//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] + 1 != nums[i + 1]) {
//                return false;
//            }
//        }
//        if (nums[0] == 0) {
//
//        }
    }
}
