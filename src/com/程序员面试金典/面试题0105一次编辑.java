package com.程序员面试金典;

public class 面试题0105一次编辑 {
}
/*
题目要求：
插入一个字符，删除一个字符或者替换一个字符

思路：
1、首先判断两个字符串是否相同
2、不同的话，判断长度，定义一个temp变量，用来记录变化次数
3、如果长度相同，则i，j指针比较是否不同处有大于1个
4、如果长度不同，利用两个指针i，j一起从起点出发，
5、如果发现不同，则长者（i,j）++，temp++，
6、利用循环判断temp是否<=1;

此处撰写解题思路
关键思路： 最多只能差一位
1.长度相同时， 最多只能不相同一位
2.长度不同时，删除一位和添加一位 本质上是无区别的
且有且只有一位不同，那么就去探索 当前对照字符串的同位和下一位（或的关系，一个成立就好）
其余情况直接返回false；



 */

class Solution121 {
    public boolean oneEditAway(String first, String second) {
        int n1 = first.length(), n2 = second.length();
        int flag = Math.abs(n1 - n2);
        int temp = 0;
        if (flag > 1) { //长度差大于1，必有两次及以上改动
            return false;
        } else if (flag == 0) { // 长度相等，则一个一个比较
            for (int i = 0; i < n1; i++) {
                if (first.charAt(i) != second.charAt(i)) {
                    temp++;
                }
                if (temp > 1) {
                    return false;
                }
            }
            return true;
        } else {  // 长度差等于1的情况，
            if (n1 == 0 || n2 == 0) {
                return true;
            }
            int i = 0, j = 0;
            while (temp <= 1) {
                if (first.charAt(i) == second.charAt(j)) {
                    i++;
                    j++;
                } else {
                    temp++;
                    if (n1 > n2) {
                        i++;
                    } else {
                        j++;
                    }
                }
                if ((i >= n1 || j >= n2) && temp <= 1) {
                    return true;
                }
            }
        }
        return false;
    }
}

