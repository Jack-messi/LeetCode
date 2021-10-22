package com.程序员面试金典;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 面试题0807无重复字符串的排列组合 {
}


class Solution0807 {

    public static void main(String[] args) {
        String[] list = permutation("ab");
        for (String s : list) {
            System.out.println(s);
        }
//        System.out.println(list.toString());
    }

    public static String[] permutation(String S) {
        List<String> list = new ArrayList<>();

        int len = S.length();
        //visit数组，用来记录该字符是否被遍历过
        int[] visit = new int[len];
        //从前到后，遍历每一个字符
        for (int i = 0; i < S.length(); i++) {
            Arrays.fill(visit,0);
            visit[i]=1;
            dfs(S,i,String.valueOf(S.charAt(i)), list, len,visit);
        }
        //将list列表转换为String字符串数组
        String[] str = new String[list.size()];
        return  list.toArray(str);
    }
    //S：表示题目给的字符串，str表示当前的字符串，list：当前列表，len，题目给的字符串长度，visit：访问数组
    public static void dfs(String S,int k, String str, List<String> list, int len,int[] visit) {
        //递归结束条件，如果当前字符串长度，和题目给的字符串长度一样，就将其加入到列表中
        if (str.length() == len) {
            list.add(str);
            return;
        }
        //否则的话，就逐一遍历每一个字符
        for (int i = 0; i < S.length(); i++) {
            if (visit[i]!=1)
            {
                visit[i]=1;//遍历字符S.charAt(i)，则将其标记已经遍历过了。
                dfs(S,i,str+S.charAt(i), list, len,visit);
                visit[i]=0;//遍历字符S.charAt(i)结束，接将其标记为没有被遍历过。
            }

        }

    }
}



