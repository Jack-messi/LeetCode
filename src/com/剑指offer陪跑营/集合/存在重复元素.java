package com.剑指offer陪跑营.集合;

import java.util.HashSet;

public class 存在重复元素 {
}

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }
        return nums.length==set.size();
    }
}