package com.程序员面试金典;

public class 面试题0507配对交换 {
}
/*
思路：

0x55555555(十六进制) = 01010101010101010101010101010101(二进制)
0xaaaaaaaa(十六进制) = 10101010101010101010101010101010(二进制)

ans = (提取奇数位<<1)+(提取偶数位>>1)

 */

class Solution {
    public int exchangeBits(int num) {
        return ((num & 0x55555555) << 1) | ((num & 0xaaaaaaaa) >> 1);
    }
}