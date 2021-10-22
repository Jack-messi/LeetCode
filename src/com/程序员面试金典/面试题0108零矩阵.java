package com.程序员面试金典;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class 面试题0108零矩阵 {
}

/*
思路：
1、先找到数组中为0的位置（i，j）然后将ij存储在栈中
2、将栈中内容依次pop两个，（i，j）将i行，和j列内容置0
*/

class Solution0108 {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;  //代表行的大小 M
        int col = matrix[0].length;  //代表列的大小 N
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 0) {
                    stack.push(i);
                    stack.push(j);
                }
            }
        }
        while (!stack.isEmpty()) {
            int j = stack.pop();  //取列
            int i = stack.pop();  //取行
            for (int k = 0; k < row; k++) {
                matrix[k][j] = 0;
            }
            for (int k = 0; k < col; k++) {
                matrix[i][k] = 0;
            }
        }
    }
}
