package com.程序员面试金典;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 面试题0403特定深度节点链表 {
}

class Solution0403 {
    public ListNode[] listOfDepth(TreeNode tree) {
        int depth = getDepth(tree);//得到树的深度
        ListNode[] list = new ListNode[depth];//树有多深，就创建深度大小的数组

        if (depth == 0) {//根节点为null，返回空数组
            return list;
        }

        Queue<TreeNode> queue = new LinkedList<>();//LinkedList可以实现队列，满足先进先出的要求
        queue.offer(tree);//第一层，始终是根节点，也就一个，直接放进队列

        for (int i = 0; i < depth; i++) {  //一层一层的来遍历
            int eachLayerSize = queue.size();  //这一层的节点数
            ListNode headNode = new ListNode(-1); //头节点，便于插入操作
            ListNode temp = headNode;//复制一个，便于移动

            for (int j = 0; j < eachLayerSize; j++) {//遍历该层各节点，放到链表中
                TreeNode curNode = queue.poll();//先入先出，将目前的节点弹出，队列中也就没有该节点了
                temp.next = new ListNode(curNode.val);//放入链表
                temp = temp.next;//链表后移一位以便再次插入
                //想象树的样子，当我们在遍历某一层时，也要把下一层的元素放进来，不然下一层的元素怎么拿得到呢？
                // 注意要从左往右，因为左子节点先于右子节点。
                // 因为是队列，后入的后出，所以不用担心，现在放进去有什么影响，for循环只遍历当前层的元素

                if (curNode.left!=null)
                {
                    queue.offer(curNode.left);
                }
                if (curNode.right != null) {
                    queue.offer(curNode.right);
                }
            }
            list[i] = headNode.next;//该层遍历结束，把该层链表放入数组
        }
        return list;
    }

    //获取树的深度
    public int getDepth(TreeNode tree) {
        if (tree == null) {
            return 0;
        }
        return (Math.max(getDepth(tree.left), getDepth(tree.right)) + 1);
    }
}
