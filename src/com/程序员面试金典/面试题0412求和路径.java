package com.程序员面试金典;

public class 面试题0412求和路径 {
}

/*
思路：
1、利用先序遍历，处理当前节点，遍历左边节点，遍历右边节点
2、处理当前节点的时候，判断当前节点往下走是否能凑成和为sum的路径；最后返回路径和

 */
class Solution0412 {
    public int pathSum(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        return getCount(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }

    //判断当前节点往下走是否能凑成和为sum的路径
    public int getCount(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        sum -= root.val;
        int count = sum == 0 ? 1 : 0;
        count += getCount(root.left, sum);
        count += getCount(root.right, sum);
        return count;
    }
}

