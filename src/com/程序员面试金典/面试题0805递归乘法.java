package com.程序员面试金典;

public class 面试题0805递归乘法 {
}

class Solution0805 {
    public int multiply(int A, int B) {
        if (A > B) {
            A = A ^ B;
            B = A ^ B;
            A = A ^ B;
        }
        if (A > 0) {
            return B + multiply(A - 1, B);
        }
        return 0;
    }
}






