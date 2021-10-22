package com.剑指offer陪跑营.哈希表Map;

import java.util.HashMap;

public class 找不同 {
}

class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, 1);
        }
        char a=' ';
        for (char c : t.toCharArray()) {
            if (map.getOrDefault(c, 0) == 0) {
                a = c;
                break;
            }
        }
        return a;
    }
}



 class Solutiona1 {
 public char findTheDifference(String s, String t) {
     HashMap<Character, Integer> hms = new HashMap<>();
     HashMap<Character, Integer> hmt = new HashMap<>();



     int i,j=0,x;

     for (i = 0; i < s.length(); i++) {
         x = hms.getOrDefault(s.charAt(i),0);
         hms.put(s.charAt(i),1+x);
         x = hmt.getOrDefault(t.charAt(i),0);
         hmt.put(t.charAt(i), 1+x);
     }

     x = hmt.getOrDefault(t.charAt(i),0);
     hmt.put(t.charAt(i), 1+x);

     for (i = 0; i < t.length(); i++) {
         int x1 = hms.getOrDefault(t.charAt(i), -1);
         int x2 = hmt.getOrDefault(t.charAt(i), -1);
         if (x1 != x2) {
             j=i;
             break;
         }
     }

     return t.charAt(j);
 }

//     public char findTheDifference(String s, String t) {
//     return (char) (t.chars().sum() - s.chars().sum());
// }
 }
