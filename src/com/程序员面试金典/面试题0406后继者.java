package com.程序员面试金典;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.List;

public class 面试题0406后继者 {
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

/*
思路：
1、题目就是求二叉树中序遍历后的某个结点的后继结点
2、利用递归版的中序遍历，List<TreeNode> res 存储中序遍历结点结果
3、若要指定的节点为最后一个节点，那么其后继必然是null，否则就是该节点的next

 */

class Solution312 {
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        List<TreeNode> res = new ArrayList<>();
        inorder(root, res);
        int flag = 0;
        for (int i = 0; i < res.size(); i++) {
            if (res.get(i) == p) {
                flag = i;
                break;
            }
        }
        if (flag + 1 < res.size()) {
            return res.get(flag + 1);
        }else {
            return null;
        }
    }

    public void inorder(TreeNode root, List<TreeNode> res) {
        if (root == null) {
            return;
        }
        inorder(root.left, res);
        res.add(root);
        inorder(root.right, res);

    }
}
