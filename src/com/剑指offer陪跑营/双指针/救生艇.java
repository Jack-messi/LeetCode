package com.剑指offer陪跑营.双指针;

import java.util.Arrays;

public class 救生艇 {
}

class Solution12 {
    public int numRescueBoats(int[] people, int limit) {
        //进行从小到大排序
        Arrays.sort(people);
        //定义左指针往右走，右指针往左走，能配对就走
        int i = 0, j = people.length - 1, result = 0;
        while (i <= j) {
            if (people[i] + people[j] <= limit) {
                i++;
                j--;
                result++;
            } else {
                j--;
                result++;
            }
        }
        return result;
    }
}


