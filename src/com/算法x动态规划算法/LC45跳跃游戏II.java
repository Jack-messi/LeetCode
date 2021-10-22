package com.算法x动态规划算法;

import java.util.Arrays;

public class LC45跳跃游戏II {
    public static void main(String[] args) {
        int[] a = new int[]{1, 3, 1, 0, 2, 1};
        int x = jump(a);
        System.out.println(x);
    }

    //贪心解法1
//    public static int jump(int[] nums) {
//        int position = nums.length - 1;
//        int steps = 0;
//        while (position > 0) {
//            for (int i = 0; i < position; i++) {
//                //i+nums[i],表示能跳的位置，如果大于目标位置
//                if (i + nums[i] >= position) {
//                    position=i;
//                    steps++;
//                    break;
//                }
//            }
//        }
//        return steps;
//    }

    //贪心解法2
//    public static int jump(int[] nums) {
//        int maxposition = 0;
//        int end = 0;
//        int step = 0;
//
//        for (int i = 0; i < nums.length - 1; i++) {
//            maxposition = Math.max(maxposition, i + nums[i]);
//            if (i == end) {
//                end = maxposition;
//                step++;
//            }
//        }
//        return step;
//    }

    //动态规划
    public static int jump(int[] nums) {
        int len = nums.length;
        int max = len + 1;    //定义最大值，len+1点是无法跳到的，超出nums数组了，
        int[] dp = new int[max]; //定义dp动态数组，dp[n]表示跳到n点所需的最小跳跃数。
        Arrays.fill(dp, max);//数组元素全部赋值为最大值，
        dp[0] = 0;   //跳到位置0所需跳跃数为0，因为本身就在0位置、

        //
        for (int i = 0; i < len - 1; i++) {
            //i+nums[i] 表示：起点处可以跳到的距离、
            for (int j = i + 1; j <= i+nums[i]; j++) {
                if (j<len) {
                    dp[j] = Math.min(dp[j],dp[i]+1);
                }
                else {
                    break;
                }
            }
        }
        return dp[len - 1];
    }


}
