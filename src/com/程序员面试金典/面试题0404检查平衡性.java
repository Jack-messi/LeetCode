package com.程序员面试金典;

public class 面试题0404检查平衡性 {
}

class Solution0404 {

    public boolean isBalanced(TreeNode root) {
        if (root==null){
            return true;
        }
        //分别计算左子树和右子树的高度
        int left = getDepth(root.left);
        int right = getDepth(root.right);
        //这两个子树的高度不能超过1，并且他的两个子树也必须是平衡二叉树
        return Math.abs(left-right) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }
    //计算树中节点的高度
    public int getDepth(TreeNode root){
        if (root == null) {
            return 0;
        }
        return (Math.max(getDepth(root.left), getDepth(root.right)) + 1);
    }
}