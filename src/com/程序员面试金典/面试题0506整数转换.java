package com.程序员面试金典;

public class 面试题0506整数转换 {
}



/*
思路：
1、利用Java的toBinaryString方法，将整数转换为二进制，再反转后存储在StringBuilder中，s1,s2;
2、使用两个指针，i，j分别指向s1,s2，进行比较，只要不同就res++，短的字符串先停下
3、最后再判断长的，剩下的有多少个为1的字符，res+多少；
4、返回res
 */

class Solution0506 {

    public static void main(String[] args) {
        int a = 528611498;
        int b = -1619967984;
        System.out.println(convertInteger(a, b));

    }

    public static int convertInteger(int A, int B) {
        String s = Integer.toBinaryString(A);
        StringBuilder s1 = new StringBuilder(s).reverse();
        s = Integer.toBinaryString(B);
        StringBuilder s2 = new StringBuilder(s).reverse();

        int lena = s1.length();
        int lenb = s2.length();

        int res = 0;
        int i, j;
        for (i = 0, j = 0; i < lena && j < lenb; i++, j++) {
            if (s1.charAt(i) != s2.charAt(j)) {
                res++;
            }
        }
        if (i == lena) {
            while (j < lenb) {
                if (s2.charAt(j) == '1') {
                    res++;
                }
                j++;
            }
        }
        if (j == lenb) {
            while (i < lena) {
                if (s1.charAt(i) == '1') {
                    res++;
                }
                i++;
            }
        }
        return res;
    }
}




