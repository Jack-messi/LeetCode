package com.剑指Offer;

import java.util.Arrays;

public class 剑指Offer40最小的k个数 {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 1};
        int[] narr = getLeastNumbers(arr, 2);
        for (int i : narr)
            System.out.println(i);
    }

//    public static int[] getLeastNumbers(int[] arr, int k) {
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = 0; j < arr.length - i - 1; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//        int[] newarr = new int[k];
//        for (int i = 0; i < k; i++) {
//            newarr[i] = arr[i];
//        }
//        return newarr;
//    }
    public static int[] getLeastNumbers(int[] arr, int k) {
        Arrays.sort(arr);
        return Arrays.copyOfRange(arr,0,k);


    }
}
