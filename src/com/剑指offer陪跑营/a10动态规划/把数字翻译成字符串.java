package com.剑指offer陪跑营.a10动态规划;

import java.util.Arrays;
import java.util.Collections;

import static java.lang.Math.pow;

public class 把数字翻译成字符串 {
}

class Solution {
    public static void main(String[] args) {

        translateNum(25);
    }

    public static int translateNum(int num) {
        int num1 = num, num2 = 0;
        int len = 0;
        while (num1 != 0) {
            len++;
            num1 = num1 / 10;
        }
        if (len == 1) {
            return 1;
        }
        num1 = num;
        char[] nums = new char[len + 1];
        for (int i = len - 1; i >= 0; i--) {
            nums[i] = (char) (num1 % 10);
            num1 = num1 / 10;
        }
        int[] dp = new int[len + 1];
        dp[0] = 1;
        if (len > 1) {
            dp[1] = 1;
        }

        for (int i = 2; i <= len; i++) {
            int temp = (nums[i - 2] + 0) * 10 + (nums[i - 1] + 0);
            if (temp >= 10 && temp <= 25) {
                dp[i] = dp[i - 1] + dp[i - 2];
            } else {
                dp[i] = dp[i - 1];
            }
        }
        return dp[len];
    }
}

class Solution2 {
    public int translateNum(int num) {
        String s = String.valueOf(num);
        int[] dp = new int[s.length()+1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= s.length(); i++) {
            String temp = s.substring(i - 2, i);
            if (temp.compareTo("10") >= 0 && temp.compareTo("25") <= 0) {
                dp[i] = dp[i - 1] + dp[i - 2];
            } else {
                dp[i] = dp[i - 1];
            }
        }
        return dp[s.length()];
    }
}


