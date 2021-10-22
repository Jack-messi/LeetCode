package com.剑指Offer;

public class 剑指Offer58I翻转单词顺序 {
    public static void main(String[] args) {
        String s = new String("the sky is blue");
        System.out.println(reverseWords("  a good   example  "));
    }
    public static String reverseWords(String s) {
        //去除字符串左右两边的空格
        String s1 = s.trim();
//        String s1 = s.replaceAll("^[　 ]+|[　 ]+$","");
        String[] a =  s1.split(" ");
       StringBuilder sb = new StringBuilder();

//        System.out.println(a.length);
       for (int i = a.length-1;i>0;i--)
       {
           //判断字符串是否为空格
           if (!a[i].trim().isEmpty())
           {
               sb.append(a[i]+" ");
           }
       }
       sb.append(a[0]);
       String ss = sb.toString();
       return ss;
    }
}
