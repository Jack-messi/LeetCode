package com.剑指Offer;

public class 剑指Offer53II0n1中缺失的数字 {
    public static void main(String[] args) {
        int[] nums = new int[]{0,1,2,3,4,5,6,7,9};
        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {
        int l = 0, r = nums.length - 1;
        int m;
        while (l <= r) {

            m = (l + r) / 2;
            if (nums[m] == m) {
                l = m + 1;
            }
            if (nums[m] > m) {
                r = m - 1;
            }
        }
        return l;
    }
}
