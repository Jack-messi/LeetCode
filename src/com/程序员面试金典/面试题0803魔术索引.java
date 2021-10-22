package com.程序员面试金典;

public class 面试题0803魔术索引 {
}

class Solution0803 {
    public int findMagicIndex(int[] nums) {

        int res=-1;
        int i;
        for (i = 0; i < nums.length; i++) {
            if (nums[i]==i){
                return i;
            }
        }
        return res;
    }
}


class Solution08032 {
    public int findMagicIndex(int[] nums) {
        int index = 0;//从索引为0的元素开始寻找
        while (index <= nums.length){
            if (index == nums[index]){//找到了
                return index;
            } else if (index < nums[index]){//跳跃到索引nums[index]处继续查找
                index = nums[index];
            } else {//index > nums[index]
                index++;
            }
        }
        return -1;
    }
}


