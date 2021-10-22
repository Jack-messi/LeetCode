package com.demo;

import static java.lang.Math.*;

//public class Test1 {
//}
class Solution {

    public static double Sqrt(double a) {
        double esp = 1e-6;
        if (a < 0) {
            return a;
        }
        double mid, left, right,last;
        left = 0;
        right = a;
        mid = (left + right) / 2;
        do {
            if (mid * mid > a) {
                right = mid;
            } else {
                left = mid;
            }
            last=mid;
            mid=(left+right)/2;
        }while (abs(last-mid)>esp);
        return mid;
    }

    public static void main(String[] args) {
        double db = 0.43242;
        double esp = 1e-6;
        System.out.println(Math.sqrt(db));
        System.out.println(Sqrt(db));
    }
}







