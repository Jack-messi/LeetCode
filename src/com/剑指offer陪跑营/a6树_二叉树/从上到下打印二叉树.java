package com.剑指offer陪跑营.a6树_二叉树;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 从上到下打印二叉树 {
}
//层次遍历
class Solution8 {
    public int[] levelOrder(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        int[] arr={};
        if (root == null) {
            return arr;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);  //将根节点入队
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();  //出队队头元素并访问
            res.add(node.val);
            if (node.left != null) {  //如果当前节点的左节点不为空入队
                queue.offer(node.left);
            }
            if (node.right != null) {  //如果当前节点的右节点不为空，把右节点入队
                queue.offer(node.right);
            }
        }
        arr = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            arr[i]=res.get(i);
        }
        res.stream().mapToInt(Integer::intValue).toArray();
        return arr;
    }
}

