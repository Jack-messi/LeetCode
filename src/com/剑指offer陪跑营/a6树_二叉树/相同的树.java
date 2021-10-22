package com.剑指offer陪跑营.a6树_二叉树;

import sun.reflect.generics.tree.Tree;

import java.util.List;

public class 相同的树 {
}


class Solution22 {
    //    boolean flag=true;
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Boolean flag = preorder(p, q);
        return flag;
    }

    public boolean preorder(TreeNode p, TreeNode q) {
        if ((p == null && q != null) || (q == null && p != null)) {
            return false;
        }
        if (p != null && q != null) {
            if (p.val != q.val) {
                return false;
            }
        }
        if (p == null && q == null) {
            return true;
        }
        boolean flag;
        if (false == preorder(p.left, q.left)) {
            return false;
        }
        if (false == preorder(p.right, q.right)) {
            return false;
        }
        return true;
    }
}

class Solution23 {
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


class Test {

    public static void main(String[] args) {
        int a = 1;
        test(a);
        System.out.println(a);
    }

    public static void test(int a) {
        a = 2;
    }
}



