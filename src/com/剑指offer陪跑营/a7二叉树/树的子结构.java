package com.剑指offer陪跑营.a7二叉树;

import java.util.List;

public class 树的子结构 {

}
class Solution2 {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        return false;
    }

    public void preorder(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        res.add(root.val);
        preorder(root.left, res);
        preorder(root.right, res);
    }
}

