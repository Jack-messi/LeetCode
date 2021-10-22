package com.程序员面试金典;

public class 面试题0502二进制数转字符串 {
}

class Solution0502 {
    public String printBin(double num) {

        StringBuilder ans = new StringBuilder("0.");

        while (num != 0) {
            num *= 2;
            if (num >= 1) {
                ans.append("1") ;
                num -= 1;
            } else {
                ans.append("0");
            }
            if (ans.length() > 32) {//如果不能表示为2进制形式
                return "ERROR";
            }
        }
        return ans.toString();
    }
}

