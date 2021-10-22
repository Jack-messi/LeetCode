package com.程序员面试金典;

public class 面试题0402最小高度树 {
}
/*
思路：
1、题目意思，就是要将一个有序数组，转换为一棵平衡二叉树（AVL）
 */

class Solution04002 {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        return sortArrayToBST(nums, 0, nums.length - 1);
    }

    public TreeNode sortArrayToBST(int[] num, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) >> 1;
        TreeNode root = new TreeNode(num[mid]);
        root.left = sortArrayToBST(num, start, mid - 1);
        root.right = sortArrayToBST(num, mid + 1, end);
        return root;
    }
}

