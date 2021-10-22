package com.程序员面试金典;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class 面试题0102判定是否互为字符重排 {
}

class Solution11 {
    public boolean CheckPermutation(String s1, String s2) {


        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0) + 1);
        }
        return false;
    }

    public static void main(String[] args) {
        int n,num;
//        StringBuilder num = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        while (n-- > 0) {




            num = sc.nextInt();

            String s = String.valueOf(num);
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < s.length(); i++) {
                String s1 = Integer.toBinaryString((int)s.charAt(i)-48);
                sb.append(s1);
            }


            s = sb.reverse().toString();

            s = s.replaceAll("^(0+)", "");


            Stack<Character> stack = new Stack<>();
            stack.push(s.charAt(0));
            for (int i = 1; i < s.length(); i++) {
                if (!stack.peek().equals(s.charAt(i))) {
                    stack.push(s.charAt(i));
                }
            }


            StringBuilder str = new StringBuilder();
            while (!stack.isEmpty()) {
                str.append(stack.pop());
            }
            int i =  Integer.valueOf(str.reverse().toString());
            System.out.println(i);
        }
    }
}