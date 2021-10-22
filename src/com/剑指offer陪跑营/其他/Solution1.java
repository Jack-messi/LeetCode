package com.剑指offer陪跑营.其他;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solution1 {
//    //    public int[] result(int[] nums) {
//    public static void main(String[] args) {
//        int[] nums = new int[]{-1, 3, 7, 79, 9};
////        int[] nums = new int[]{1,2,-1,3,4,5,6,50,9};
//        int len = nums.length;
//        int[] res = new int[len];
//        int[][] temp = new int[2][len];
//        int lmax = nums[0], rmin = nums[len - 1];
//        temp[0][0] = lmax;
//        temp[1][len - 1] = rmin;
//        for (int i = 0; i < len; i++) {
//            if (lmax < nums[i]) {
//                lmax = nums[i];
//            }
//            temp[0][i] = lmax;
//            if (rmin > nums[len - i - 1]) {
//                rmin = nums[len - i - 1];
//            }
//            temp[1][len - i - 1] = rmin;
//        }
//        int j=0;
//        for (int i = 1; i < len - 1; i++) {
//            if (temp[0][i] == temp[1][i]) {
//                res[j++]=temp[0][i];
//            }
//        }
//
////        for (int i = 0; i < 2; i++) {
////            for (int i1 = 0; i1 < len; i1++) {
////                System.out.print(temp[i][i1] + " ");
////            }
////            System.out.println();
////        }
//    }
//}


    //    public double[] result(double[] nums) {
    public static void main(String[] args) {

//        double[] nums = new double[]{-1, 3, 7, 79, 9};
//        double[] nums = new double[]{1, 2, -1, 3, 4, 5, 6, 50, 9};
        double[] nums = new double[]{2, 3, 1, 8, 9, 20, 12};
        int len = nums.length;
        double[] res = new double[len];
        double[][] temp = new double[2][len];
        double lmax = nums[0], rmin = nums[len - 1];
        temp[0][0] = lmax;
        temp[1][len - 1] = rmin;
        for (int i = 0; i < len; i++) {
            if (lmax < nums[i]) {
                lmax = nums[i];
            }
            temp[0][i] = lmax;
            if (rmin > nums[len - i - 1]) {
                rmin = nums[len - i - 1];
            }
            temp[1][len - i - 1] = rmin;
        }
        int j = 0;
        for (int i = 1; i < len - 1; i++) {
            if (temp[0][i] == temp[1][i]) {
                res[j++] = temp[0][i];
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int i1 = 0; i1 < len; i1++) {
                System.out.print(temp[i][i1] + " ");
            }
            System.out.println();
        }
    }

}


class Soulution2 {

    public static void main(String[] args) {
        String s = "0202";
        System.out.println(result(s));
    }

    public static int result(String nums) {
        int len = nums.length();
        int[] dp = new int[len + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= len; i++) {
            String temp = nums.substring(i - 2, i);
            if (temp.compareTo("10") >= 0 && temp.compareTo("26") <= 0) {
                dp[i] = dp[i - 1] + dp[i - 2];
            } else {
                dp[i] = dp[i - 1];
            }
        }
        return dp[len];
    }

}


class Solution2 {
    public static void main(String[] args) {


        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(111, null);
        map.put(222, null);
        map.put(333, null);

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println(System.identityHashCode((new Object()).toString()));
        int a = 1000;
        Integer aa = 222;
        Integer aaa = 222;
        System.out.println(aa == aaa);
        Integer b = Integer.valueOf(1000);
        System.out.println(a == b);

        Integer c = new Integer(1000);

        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(b));
        System.out.println(System.identityHashCode(c));

        System.out.println(a == c);
        System.out.println(b == c);
        System.out.println(b.equals(c));

        Integer a1 = 127;
        Integer a2 = 127;
        Integer b1 = 128;
        Integer b2 = 128;

        // true
        System.out.println(a1 == a2);

        // false
        System.out.println(b1 == b2);

    }
}


class Solution3 {
    public static void main(String[] args) {
        String string = 'a' + 'b' + new String("c");
    }
}













