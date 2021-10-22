package com.剑指offer陪跑营.a6树_二叉树;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 从上到下打印二叉树II {
}



class Solution1 {
      //从上至下一层一层打印,称之为广度优先搜索,BFS;可以借助队列的先进先出特性来做
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
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
            res.add(tmp);
        }
        return res;
    }
}