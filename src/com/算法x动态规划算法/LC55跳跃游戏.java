package com.算法x动态规划算法;

public class LC55跳跃游戏 {
    public static void main(String[] args) {
        int[] nums = new int[]{3,2,1,0,4};
        System.out.println(canJump(nums));

    }

    public static boolean canJump(int[] nums) {
        //定义max，表示能跳到最大的位置
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            //如果某个位置距离i>max，说明就不能跳到这里
            if (i > max) {
                return false;
            }
            //这里nums[i] + i ，说明上面i<max，从而说明，是可以跳到这个位置的，当前位置。
            //然后就判断，当前的最大值max和这个位置i+num[i]比较大小，取最大。
            max = Math.max(max, nums[i] + i);
        }
        return true;
    }
}
