package com.剑指Offer;

//class TreeNode {
//    int val;
//    TreeNode left;
//    TreeNode right;
//    TreeNode(int x) { val = x; }
//}


public class 剑指Offer28对称的二叉树 {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,2,3,4,4,3};
        TreeNode root = new TreeNode(a[0]);
        root = createTree(root,0,a);


    }

    public static TreeNode createTree(TreeNode node, int i, int[] a) {
//        if (a[i] == 0) {
//            return null;
//        } else {
//            node.val = a[i];
//        }

        TreeNode leftChild = new TreeNode(a[i]);
        node.left = createTree(leftChild,++i,a);
        TreeNode rightChild = new TreeNode(a[i]);
        node.right = createTree(rightChild,++i,a);

        return node;
    }

    public static boolean isSymmetric(TreeNode root) {
        TreeNode root2 = mirrorTree(root);
        return isSameTree(root, root2);
    }

    //判断子树是否相同
    public static boolean isSameTree(TreeNode first, TreeNode second) {
        if (first == null && second == null) {
            return true;
        } else if (first == null || second == null) {
            return false;
        }
        if (first != null && second != null) {
            if (first.val != second.val) {
                return false;
            } else {
                return isSameTree(first.left, second.left) && isSameTree(first.right, second.right);
            }
        }
        return false;
    }

//    public static boolean isSameTree(TreeNode p,TreeNode q){
//        if(p==null && q==null){  //先判断根，再判断左子树和右子树
//            return true;
//        }
//        if(p==null){
//            return false;
//        }
//        if(q==null){
//            return false;
//        }
//        return p.val==q.val && isSameTree(p.left,q.left)
//                && isSameTree(p.right,q.right);
//    }


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
