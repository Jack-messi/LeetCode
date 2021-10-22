package com.算法x贪心算法;

import java.util.Arrays;

/*
1、题目：指定币值和相应的数量，用最少的数量凑齐某金额。
2、思路：利用贪心算法，我们优先选择面值大的钱币，以此类推，直到凑齐总金额。
3、算法实现：
*/
public class 钱币找零问题 {
    public static void main(String[] args) {
        greedy1();
    }
    public static void greedy1(){
        //面额
        int[] values = { 1, 2, 5, 10, 20, 50, 100 };
        //数量
        int[] counts = { 3, 3, 2, 1, 1, 3, 3 };
        //获取需要各种面值多少张
        int[] result = getNumber1(447, values, counts);
        System.out.println("各币值的数量："+ Arrays.toString(result));
    }
    public static int[] getNumber1(int sum , int[] values, int[] counts)
    {
        int[] result = new int[7];
        int add=0; //当前凑的金额
        for(int i=values.length-1;i>=0;i--)
        {
            int num = (sum-add)/values[i];
            if(num>counts[i])
            {
                num=counts[i];
            }
            add=add+num*values[i];
            result[i]=num;
        }
        return result;
    }

}


