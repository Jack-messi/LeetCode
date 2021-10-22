package com.剑指offer陪跑营.a13;

import java.util.HashMap;
import java.util.HashSet;

public class 和为s的两个数字 {
}

class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        HashSet<Integer> set = new HashSet<>();
        int[] arr = new int[2];
        for (int i : nums) {
            set.add(i);
        }
        for (int i : nums) {
            if (set.contains(target - i)) {
                arr[0]=i;
                arr[1]=target-i;
            }
        }
    return arr;
    }
}













