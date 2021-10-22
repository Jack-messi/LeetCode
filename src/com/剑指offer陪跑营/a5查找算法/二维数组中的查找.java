package com.剑指offer陪跑营.a5查找算法;

public class 二维数组中的查找 {
}

class Solution {

    public static void main(String[] args) {
//        int[][] matrix = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
//        int[][] matrix = {{1, 4, 7, 11, 15}, {2, 5, 8, 15, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
//        int[][] matrix = {{-5}};
        int[][] matrix = {};
        System.out.println(matrix.length);
        System.out.println(matrix[0].length);
        System.out.println(findNumberIn2DArray(matrix, -5));


    }

    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix.length==0||matrix[0].length==0)
        {
            return false;
        }
        int x = line(matrix, target);
        System.out.println(x);
        for (int i = 0; i <= x; i++) {
            int y = column(matrix, target, i);
            System.out.println("i: "+i+"="+matrix[i][y]);
            if (matrix[i][y] == target) {
                return true;
            }
        }
        return false;



    }

    //查找行
    public static int line(int[][] matrix, int target) {
        int left = 0, right = matrix.length - 1, midm, x = 0;
        while (left <= right) {
            midm = (left + right) / 2;
            if (matrix[midm][0] <= target) {
                x = midm;
                left = midm + 1;
            } else {
                right = midm - 1;
            }
        }
        return x;
    }

    //查找列
    public static int column(int[][] matrix, int target, int midm) {
        int left = 0, right = matrix[0].length - 1, midn, y = 0;
        while (left <= right) {
            midn = (left + right) / 2;
            if (matrix[midm][midn] <= target) {
                y = midn;
                left = midn + 1;
            } else {
                right = midn - 1;
            }
        }
        return y;
    }
}