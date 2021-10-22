package com.程序员面试金典;

public class 面试题0501插入 {
}

/*
思路：
1、将数据分成三个部分，左，中，右；中就是要替换的那一段
2、分别使用位运算，调整三部分
3、最后使用按位与，连接三部分
 */

class Solution0501 {
    public int insertBits(int N, int M, int i, int j) {
        int left = N >> j >> 1;  //先把最左边的位置调整好，即抛弃了替换部分和最低位
        left = left << j << 1;   //因为最后要进行位运算，所以先把left移动到原来的高位上
        int middle = M << i;   //替换N的j~i位，那么只需要将M左移到原来的高位上。
        int right = N & ((1 << i) - 1);  //只需要N的低位，将高位置零，（1<<2)-1=(11)2
        return left | middle | right;
    }
}

