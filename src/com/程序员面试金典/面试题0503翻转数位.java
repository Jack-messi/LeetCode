package com.程序员面试金典;

import java.util.Arrays;

public class 面试题0503翻转数位 {
}
/*
思路：
1、求连续1的数量，如遇到0，则下标指针++
2、稍微思考一下，不难明白此时本题就转换为数组中最大的相邻元素之和。
3、最后要防一手 -1 的情况，因为-1的二进制为32个1。直接返回即可

 */

class Solution1121 {
    public int reverseBits(int num) {
        if (num==-1)
        {
            return 32;
        }
        String s = Integer.toBinaryString(num);
        System.out.println(s);
        int n = 0, max = 0;
        int[] a = new int[32];
        int f = 0;
        //统计每一段连续1的数量
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                a[n]++;
            } else {
                n++;
            }
        }
        for (int i = 0; i < a.length - 1; i++) {
            max = Math.max(max, a[i] + a[i + 1] + 1);
        }
        return max;
    }
}





