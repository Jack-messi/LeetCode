package com.剑指Offer;

import java.util.HashSet;

public class 剑指Offer57和为s的两个数字 {
    public static void main(String[] args) {
        int[] nums = new int[]{45,46,67,73,74,74,77,83,89,98};
        int[] arr = twoSum(nums, 147);
        for (int i : arr) {
            System.out.println(i);
        }

    }
    public static int[] twoSum(int[] nums, int target)
    {
        HashSet<Integer> set = new HashSet<>();
        int[] arr = new int[2];
        for (int i:nums)
        {
            set.add(i);
        }
        for (int i:nums)
        {
            if (set.contains(target-i))
            {
                arr[0]=i;
                arr[1]=target-i;
            }
        }
        return arr;
    }


//    public static int[] twoSum(int[] nums, int target) {
//
//        int left = 0, right = 0,flag=0;
//        int avg = target >> 1;
//        int[] num = new int[2];
//        for (int i = 0; i < nums.length; i++) {
//            if (avg <= nums[i]&&left==0) {
//                left = i;
//            }
//            if (target <= nums[i]||(i==nums.length-1)) {
//                right = i;
//                break;
//            }
//        }
//        System.out.println(left);
//        System.out.println(right);
//        for (int i = 0; i <= left; i++) {
//            for (int j = right; j >= left; j--) {
//                if ((nums[i] + nums[j]) == target) {
//                    num[0] = nums[i];
//                    num[1] = nums[j];
//                    flag=1;
//                    break;
//                }
//            }
//            if (flag==1) {
//                break;
//            }
//        }
//        return num;
//    }
}
