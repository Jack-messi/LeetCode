package com.剑指offer陪跑营.滑动窗口;

public class 定长子串中元音的最大数目 {
}

class Solution12 {

    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(maxVowels(s, 3));

    }

    public static int maxVowels(String s, int k) {
        int i = 0, sum = 0;
        while (i < k) {
            if (isaeiou(s.charAt(i))) {
                sum++;
            }
            i++;
        }
        if (sum == k) {
            return k;
        }
        int max = sum;
        for (int j = k; j < s.length(); j++) {

            if (isaeiou(s.charAt(j - k))) {
                sum--;
            }
            if (isaeiou(s.charAt(j))) {
                sum++;
            }
            max=Math.max(max,sum);
        }
        return max;
    }

    public static boolean isaeiou(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return true;
        } else {
            return false;
        }
    }
}






