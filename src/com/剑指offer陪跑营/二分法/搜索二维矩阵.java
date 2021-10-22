package com.剑指offer陪跑营.二分法;

public class 搜索二维矩阵 {
}

//
//class Solution122 {
//
//    public static void main(String[] args) {
////        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,50},{53,60,64,70}};
//        int[][] matrix = {{1}};
//        for (int i = 0; i < matrix.length; i++) {
//            for (int i1 = 0; i1 < matrix[i].length; i1++) {
////                System.out.println(matrix[i][i1]);
//            }
//        }
//        System.out.println(searchMatrix(matrix,30));
//    }
//
//    public static boolean searchMatrix(int[][] matrix, int target) {
//        int m = matrix.length, n = matrix[0].length;
//        int left = 0, right = m - 1, midm = 0, midn = 0;
//
//        //找出是哪一行
//        while (left <= right) {
//            midm = (left + right) / 2;
//            if (matrix[midm][0] < target) {
//                left = midm + 1;
//            } else if (matrix[midm][0] > target) {
//                right = midm - 1;
//            } else {
//                break;
//            }
//        }
//        System.out.println("left: "+left);
//        System.out.println("right: "+right);
//        midm--;
//
//
//        left = 0;
//        right = n - 1;
//        System.out.println("midm: "+midm);
//
//        //找出是哪一列
//        while (left <= right) {
//            midn = (left + right) / 2;
//            System.out.println("midn: "+midn);
//            if (matrix[midm][midn] < target) {
//                left = midn + 1;
//            } else if (matrix[midm][midn] > target) {
//                right = midn - 1;
//            } else {
//                break;
//            }
//        }
////        if (left > right) {
////            midn = left - 1;
////        }
//
//
//        System.out.println("matrix[midm][midn]: "+matrix[midm][midn]);
//
//        if (matrix[midm][midn] == target) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//}

class Solution1122 {

    public static void main(String[] args) {
//        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 50}, {53, 60, 64, 70}};
        int[][] matrix = {{1,3}};
        searchMatrix(matrix, 3);

    }
    //规范的二分查找
    public static boolean searchMatrix(int[][] matrix, int target) {
        int m = line(matrix, target);
        int n = column(matrix, target, m);
        return matrix[m][n] == target;
    }
    // 查找行
    public static int line(int[][] matrix, int target) {
        int left = 0, right = matrix.length - 1, midm = 0,x=0;
        while (left <= right) {
            midm = (left + right) / 2;
            if (matrix[midm][0] <= target) {
                x=midm;
                left = midm + 1;
            } else {
                right = midm - 1;
            }
        }
        return x;
    }
    //查找列
    public static int column(int[][] matrix, int target, int midm) {
        int left = 0, right = matrix[0].length - 1, midn = 0,y=0;
        while (left <= right) {
            midn = (left + right) / 2;
            if (matrix[midm][midn] <= target) {
                y=midn;
                left = midn + 1;
            } else {
                right = midn - 1;
            }
        }
        return y;
    }
}