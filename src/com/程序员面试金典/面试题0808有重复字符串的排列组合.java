package com.程序员面试金典;

import java.util.*;

public class 面试题0808有重复字符串的排列组合 {
}

class Solution0808 {


    public static String[] permutation(String S) {
        Set<String> set = new HashSet<>();

        int len = S.length();

        int[] visit = new int[len];
        for (int i = 0; i < S.length(); i++) {
            Arrays.fill(visit,0);
            visit[i]=1;
            dfs(S,i,String.valueOf(S.charAt(i)), set, len,visit);
        }

        String[] str = new String[set.size()];
        set.toArray(str);
        return str;
    }

    public static void dfs(String S,int k, String str, Set<String> set, int len,int[] visit) {
        if (str.length() == len) {
            set.add(str);
            return;
        }
        for (int i = 0; i < S.length(); i++) {
            if (visit[i]!=1)
            {
                visit[i]=1;
                dfs(S,i,str+S.charAt(i), set, len,visit);
                visit[i]=0;
            }

        }

    }
}