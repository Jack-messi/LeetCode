package com.程序员面试金典;

public class 面试题0106字符串压缩 {
}

/*
思路：
1、定义一个count=0，遍历字符串，统计有几个相邻相同的字符，是的count++
2、将该字符和count相加
3、注意字符串题目，要考虑空字符串""
 */

class Solution {
    public String compressString(String str) {
        int len = str.length();
        if (len == 0) {
            return str;
        }
        int count = 1;
        StringBuilder res = new StringBuilder();
        for (int i = 1; i < len; i++) {
            if (str.charAt(i - 1) != str.charAt(i)) {
                res.append(str.charAt(i - 1));
                res.append(count);
                count = 0;
            }
            count++;
        }
        res.append(str.charAt(len - 1));
        res.append(count);
        if (res.length() < len) {
            return res.toString();
        } else {
            return str;
        }
    }
}