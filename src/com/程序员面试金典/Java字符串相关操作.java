package com.程序员面试金典;

import java.util.Locale;

public class Java字符串相关操作 {

    public static void main(String[] args) {
        String str = "abcdefgabcdefg";

        //indexOf()：查找指定字符在字符串中第一次出现的位置，
        int index = str.indexOf("a");
        System.out.println(index);

        //toUpperCase()：将字符串中的字符变为大写形式
        String str0 = str.toUpperCase();
        System.out.println(str0);

        //toLowerCase(): 将字符串中的字符变为小写
        String str1 = "WWMMDDHH";
        String str2 = str1.toLowerCase();
        System.out.println(str2);

        //substring:截取字符串
        String str3 = str.substring(0, 3);
        System.out.println(str3);

        String str4 = str.substring(3);
        System.out.println(str4);

        //replaceAll:替换当前字符串中指定内容
        String str5 = str.replaceAll("abc","xyz");
        System.out.println(str5);

        //trim() : 能够去掉当前字符串中两端的空格
        String str6 = " abc  sdf  ";
        String str7 = str6.trim();
        System.out.println(str6);
        System.out.println(str7);

        //字符串合字符串 + 等于拼接
        System.out.println(str+str6);


    }
}
