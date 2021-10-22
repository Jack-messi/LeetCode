package com.剑指Offer;

import java.util.ArrayList;
import java.util.List;

public class 剑指Offer57II和为s的连续正数序列 {
    public static void main(String[] args) {
        int[][] arr = findContinuousSequence(15);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    //滑动窗口
    public static int[][] findContinuousSequence(int target) {
        List<int[]> list = new ArrayList<>();
//        int  sum = 0;
        for (int l = 1, r = 1, sum = 0; r <= (target >> 1)+1; r++) {
            sum += r;
            while (sum > target) {
                sum -= l++;
            }
            if (sum == target) {
                int[] temp = new int[r - l + 1];
                for (int i = 0; i < temp.length; i++) {
                    temp[i] = l + i;
                }
                list.add(temp);
            }

        }
        int[][] arr = new int[list.size()][];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }

    //暴力超时。
//    public static int[][] findContinuousSequence(int target) {
//        List<int[]> list = new ArrayList<>();
////        int[][] arr = new int[target / 2][];
////        int[] temp = new int[target];
//        int sum = 0, i, j, f = 0;
//        for (i = 1; i <= (target >> 1); i++) {
//            sum = i;
//            for (j = i + 1; j <= (target >> 1) + 1; j++) {
//                sum += j;
//                if (sum == target) {
//                    f = 1;
//                    break;
//                }
//            }
//            if (f == 1) {
//                int[] temp = new int[j - i + 1];
//                int m = 0;
//                for (int k = i; k <= j; k++) {
//                    temp[m++] = k;
//                }
//                f = 0;
//                list.add(temp);
//            }
//
//
//        }
//        int[][] arr = new int[list.size()][];
//        for (i = 0; i < list.size(); i++) {
//            arr[i] = list.get(i);
//        }
//
//        return arr;
//    }
}
