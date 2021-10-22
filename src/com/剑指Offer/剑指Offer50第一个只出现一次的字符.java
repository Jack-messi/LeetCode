package com.剑指Offer;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class 剑指Offer50第一个只出现一次的字符 {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));;
    }

    public static char firstUniqChar(String s) {
//        Map<Character, Integer> map = new HashMap<>();
        Map<Character,Integer> map = new LinkedHashMap<>();
        char c = ' ';
        for (int i = 0; i < s.length(); i++) {
            int k = map.getOrDefault(s.charAt(i), 0) + 1;
            map.put(s.charAt(i), k);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                c = entry.getKey();
                break;
            }

        }
        return c;

//        System.out.println(map.toString());
//        return 's';
    }
}
