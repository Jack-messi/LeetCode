package com.huwei笔试2021年4月14日;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Demo3 {
    public static void main(String[] args) {

    }
    public boolean canJump(int[] nums) {
        int x;
        x = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > x) {
                return false;
            }
            x = Math.max(x, i + nums[i]);
        }
        return true;
    }


}
//((jhku)(love)i)

////查询班级（class）下对应的学生（student）
//select sid from class=