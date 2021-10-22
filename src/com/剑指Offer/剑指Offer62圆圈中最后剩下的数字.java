package com.剑指Offer;

public class 剑指Offer62圆圈中最后剩下的数字 {
    public static void main(String[] args) {
        System.out.println(lastRemaining(5, 3));
    }

    public static int lastRemaining(int n, int m) {
        int x = 0;
        for (int i = 2; i <= n; i++) {
            x = ((x + m) % i);
        }
        return x;
    }


//    public static int lastRemaining(int n, int m) {
//
//        int[] a = new int[n];
//        int s=0;
//        for (int i = 0; i < n; i++) {
//            a[i] = i;
//        }
//        int k = 0;
//        for (int i = 0; i < n; i++) {
//            int j = 1;
//            while (j < m) {
//                if (a[k] != -1) {
//                    j++;
//                }
//                k++;
//                k=k%(n);
//            }
//            s=a[k];
//            System.out.println(s);
//            a[k]=-1;
//        }
////        for (int aa : a)
////            System.out.println(aa);
//        return s;
//    }
}
