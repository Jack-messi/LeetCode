package com.程序员面试金典;

import java.util.ArrayList;
import java.util.List;

public class 面试题0804幂集 {
}

class Solution0804 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        for (int num : nums) {
            int len = result.size();
            for (int i = 0; i < len; i++) {
                //把结果集中的每一个集合取出来，再重新放入新集合，并且再加入一个新元素
                List<Integer> res = new ArrayList<>(result.get(i));
                res.add(num);
                result.add(res);
            }
        }
        return result;
    }
}