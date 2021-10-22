package com.剑指offer陪跑营.分治法;

import java.util.HashMap;

public class 多数元素 {
}

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int res = 0;
        for (int num : nums) {
            if (map.getOrDefault(num, 0) > (nums.length / 2)) {
                res = num;
                break;
            }
        }
        return res;
    }
}

//分治法
class Solution2 {


    public int getmajority(int[] nums, int left, int right) {
        if (left == right) {
            return nums[left];
        }
        int mid = left + (right-left)/2;
        int leftm = getmajority(nums,left,mid);
        int rightm = getmajority(nums,mid+1,right);
        if (leftm==rightm)
        {
            return leftm;
        }

        int leftc;
        int rightc;

        return mid;
    }
}


//class Solution11 {
//    public:
//    int majorityElement(vector<int>& nums) {
////摩尔投票法,先假设第一个数过半数并设cnt=1；遍历后面的数如果相同则cnt+1，
//// 不同则减一，当cnt为0时则更换新的数字为候选数（成立前提：有出现次数大于n/2的数存在）
//        int res=0,cnt=0;
//        for(int i=0;i<nums.size();i++){
//            if(cnt==0) {
//                res=nums[i];
//                cnt++;
//            }
//            else{
//                res==nums[i]?cnt++:cnt--;
//            }
//        }
//        return res;
//    }
//};


