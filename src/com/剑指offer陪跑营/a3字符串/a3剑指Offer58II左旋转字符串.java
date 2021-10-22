package com.剑指offer陪跑营.a3字符串;

public class a3剑指Offer58II左旋转字符串 {
}

class Solution {
    public String reverseLeftWords(String s, int n) {
        StringBuilder sb = new StringBuilder(s);


        String s1 = sb.substring(0,n);

        String s2 = sb.substring(n,s.length());

        return s2+s1;
    }
}
