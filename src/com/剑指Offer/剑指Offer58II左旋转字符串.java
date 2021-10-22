package com.剑指Offer;

public class 剑指Offer58II左旋转字符串 {
    public static void main(String[] args) {
        System.out.println(reverseLeftWords("abcdefg",2));
    }

    public static String reverseLeftWords(String s, int n) {
        StringBuilder sb = new StringBuilder(s);

        String s1 = sb.substring(0,n);
//        System.out.println(s1);
        String s2 = sb.substring(n,s.length());

        return s2+s1;

    }
}
