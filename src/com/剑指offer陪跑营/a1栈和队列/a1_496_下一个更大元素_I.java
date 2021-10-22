package com.剑指offer陪跑营.a1栈和队列;

import java.util.Stack;

public class a1_496_下一个更大元素_I {
}


class Solutiona2 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> s = new Stack<>();
        Stack<Integer> temp = new Stack<>();
        for (int i : nums2) {
            s.push(i);
        }
        boolean flag = true;
        int max = -1;
        int[] result = new int[nums1.length];
        int i = 0;
        for (int num : nums1) {
            while (flag) {
                int top = s.pop();
                temp.push(top);
                if (top > num) {
                    max = top;

                }
                if (top == num) {
                    flag = false;
                    result[i++] = max;
                }
            }
            while (!temp.isEmpty()) {
                s.push(temp.pop());
            }
            flag = true;
            max=-1;
        }
        return result;
    }
}