package com.程序员面试金典;

public class 面试题0107旋转矩阵 {
}

/*
思路：
1、先对照对角线交换一次
2、再对照竖对角线交换一次

 */


class Solution123 {
    public void rotate(int[][] matrix) {

        int len = matrix.length;
        //先交换对角线
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //交换竖线
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][len - j - 1];
                matrix[i][len - j - 1] = temp;
            }
        }
    }
}