package com.程序员面试金典;

public class 面试题0410检查子树 {
}

/*
思路：
1、通过先序遍历树，判断当前节点是否符合，递归先序左孩子，递归先序右孩子
2、判断当前节点是否满足是两棵相同的树

 */

class Solution0410 {
    public boolean checkSubTree(TreeNode t1, TreeNode t2) {
        if (t1 == null) {
            if (t2 == null) {
                return true;
            } else {
                return false;
            }
        }
        //判断当前节点是否符合，递归先序左孩子，递归先序右孩子
        return isSameTree(t1, t2) || checkSubTree(t1.left, t2) || checkSubTree(t1.right, t2);
    }

    //递归判断两颗树是否完全相同
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p != null && q != null && q.val == p.val) {
            return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
        }else {
            return false;
        }
    }

}

//    //递归判断两颗树是否完全相同

//    public boolean recur(TreeNode r1, TreeNode r2) {
//        if (r1 == null && r2 == null) {
//            return true;
//        }
//        if (r1 == null || r2 == null) {
//            return false;
//        }
//        if (r1.val != r2.val) {
//            return false;
//        }
//        return recur(r1.left, r2.left) && recur(r1.right, r2.right);
//    }