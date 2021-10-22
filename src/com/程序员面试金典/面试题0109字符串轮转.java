package com.程序员面试金典;

import javafx.scene.chart.Chart;

public class 面试题0109字符串轮转 {
}

class Solution111 {
    public boolean isFlipedString(String s1, String s2) {
        if (s1.length() != s2.length() || s1.chars().sum() != s2.chars().sum()) {
            return false;
        }
        if (s1.equals(s1)) {
            return true;
        }
        boolean flag = false;
        for (int i = 0; i < s1.length(); i++) {
            String a1 = s1.substring(0, i);  //前子串
            String a2 = s1.substring(i);   //后子串
            System.out.println("a1= " + a1);
            System.out.println("a2= " + a2);
            StringBuilder b1 = new StringBuilder(a2);
            b1.append(a1);
            String b2 = new String(b1);
            if (b2.equals(s2)) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}


