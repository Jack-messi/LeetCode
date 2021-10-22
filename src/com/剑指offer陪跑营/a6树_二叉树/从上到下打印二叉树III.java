package com.剑指offer陪跑营.a6树_二叉树;

import java.util.*;

public class 从上到下打印二叉树III {
}

class Solution12 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean flag = true;
        while (!queue.isEmpty()) {
            List<Integer> tmp = new ArrayList<>();
            // 每一层遍历一遍
            // size会随着赋值初始化一遍,即使过程中queue的size变化得等到此次循环结束后重新赋值
            for (int size = queue.size(); size > 0; size--) {
                TreeNode node = queue.poll();
                tmp.add(node.val);
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            if (flag == true) {
                res.add(tmp);
                flag = false;
            } else {
                Collections.reverse(tmp);
                res.add(tmp);
                flag = true;
            }
        }
        return res;
    }
}