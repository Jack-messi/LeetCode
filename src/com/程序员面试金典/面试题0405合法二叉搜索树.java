package com.程序员面试金典;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class 面试题0405合法二叉搜索树 {
}

class Solution0405 {
    boolean flag = true;

    public boolean isValidBST(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inorder(root, res);
        int num = res.size();
        for (int i = 0; i < num - 1; i++) {
            if (res.get(i) >= res.get(i + 1)) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public void inorder(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }

        inorder(root.left, res);
        res.add(root.val);
        inorder(root.right, res);
    }
}


class Solution04052 {
    public boolean isValidBST(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        double inorder = -Double.MAX_VALUE;

        while (!stack.isEmpty() || root != null) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            // 如果中序遍历得到的节点的值小于等于前一个 inorder，说明不是二叉搜索树
            if (root.val <= inorder) {
                return false;
            }
            inorder = root.val;
            root = root.right;
        }
        return true;
    }
}
















