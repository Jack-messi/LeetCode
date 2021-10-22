package com.剑指Offer;

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }

public class 剑指Offer27二叉树的镜像 {
    public static void main(String[] args) {

    }

    //镜像生成另外一棵树
    public static TreeNode mirrorTree(TreeNode root) {
        if (root == null)
            return null;
        TreeNode temp = root.left;
        root.left = mirrorTree(root.right);
        root.right = mirrorTree(temp);
        return root;
    }
}
