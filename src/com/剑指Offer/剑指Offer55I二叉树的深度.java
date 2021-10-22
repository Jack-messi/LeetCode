package com.剑指Offer;

public class 剑指Offer55I二叉树的深度 {
    public static void main(String[] args) {

    }

    public static int maxDepth(TreeNode root) {
        int x =0;
        return getdeep(root,x);
    }

    public static int getdeep(TreeNode treeNode, int x) {
        if (treeNode == null) {
            return x;
        }
        x++;
        int leftDeep = getdeep(treeNode.left,x);
        int rightDeep = getdeep(treeNode.right,x);

        return Math.max(leftDeep,rightDeep);
    }
}
