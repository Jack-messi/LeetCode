package com.LC数组问题;

import java.util.Arrays;

public class 剑指Offer56I数组中数字出现的次数 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,1,2,2,3,4,4,5};
        int[] a = singleNumbers(nums);
        for (int b:a)
        {
            System.out.println(b);
        }
        System.out.println();
    }

    public static int[] singleNumbers(int[] nums) {
        Arrays.sort(nums);//给数组排个序

        int[] a = new int[2]; //定义一下用来返回的数组，因为只有两个数据

        int j=0;
        //遍历输入数组是i+2，隔开一个，因为排序后，数据排列形式为1,1,2,2,3,4,4,5,6,6（假设）
        for(int i=0;i<nums.length-1;i=i+2)
        {
            if(nums[i]!=nums[i+1])//这里，显然左边和右边如果不等的话，说明出现了单独的数据了
            {
                //显然这个数据，定是左边，不信可以找一些数据模拟一下。
                a[j++]=nums[i];
                //然后，这里因为偶数序列突然多出了一个数据，所以要减一个1，才能从新成对遍历一样的数据
                i=i-1;
            }
            if(a[1]==0)//这里，如果返回数组第二个值没有的话，必然，单次出现的数，是最后一个。这个是必然的
            {
                a[1]=nums[nums.length-1];
            }

        }
        return a;
    }
}
