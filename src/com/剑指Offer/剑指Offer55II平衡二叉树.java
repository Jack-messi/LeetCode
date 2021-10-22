package com.剑指Offer;

public class 剑指Offer55II平衡二叉树 {
    public static void main(String[] args) {

    }
//    public boolean isBalanced(TreeNode root) {
//
//    }



//    //思路一：不断求深度
//    public boolean isBalanced(TreeNode root) {
//
//        if (root == null || (root.left == null && root.right == null)) {
//            return true;
//        }
//        int left = getdeep(root.left);
//        int right = getdeep(root.right);
//        if (Math.abs(left - right) > 1) {
//            return false;
//        }
//        return isBalanced(root.left) && isBalanced(root.right);
//    }
//
//    public int getdeep(TreeNode treeNode) {
//        if (treeNode == null) {
//            return 0;
//        }
//        return Math.max(getdeep(treeNode.left), getdeep(treeNode.right)) + 1;
//    }

}
